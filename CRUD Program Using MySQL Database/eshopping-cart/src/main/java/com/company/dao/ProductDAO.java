package com.company.dao;

import java.sql.*;
import com.company.model.Product;
import com.company.util.DBConnection;

public class ProductDAO {

    public void addProduct(Product p) {
        String sql = "INSERT INTO product(name, price) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());

            ps.executeUpdate();
            System.out.println("Data added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    public void getAllProducts() {
        String sql = "SELECT * FROM product";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("price")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void updateProduct(Product p) {
        String sql = "UPDATE product SET name = ?, price = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getId());

            ps.executeUpdate();
            System.out.println("Product updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    public void deleteProduct(int id) {
    	String sql = "DELETE FROM product WHERE id = ?";
    	
    	try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
    		
    		ps.setInt(1, id);
    		ps.executeUpdate();
            System.out.println("Product deleted");
    	}
    	catch (Exception e) 
    	{
            e.printStackTrace();
        }
    }
}