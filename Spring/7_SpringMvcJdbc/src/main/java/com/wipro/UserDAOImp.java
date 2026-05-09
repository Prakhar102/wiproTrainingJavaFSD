package com.wipro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImp implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // INSERT
    public void saveUser(UserModel user) {

        String sql =
        "INSERT INTO users(id,name,email) VALUES(?,?,?)";

        jdbcTemplate.update(
                sql,
                user.getId(),
                user.getName(),
                user.getEmail());
    }

    // DISPLAY USERS
    public List<UserModel> getUsers() {

        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<UserModel>(UserModel.class));
    }

    // DELETE USER
    public void deleteUser(int id) {

        String sql = "DELETE FROM users WHERE id=?";

        jdbcTemplate.update(sql, id);
    }

    // GET SINGLE USER
    public UserModel getUserById(int id) {

        String sql =
        "SELECT * FROM users WHERE id=?";

        return jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<UserModel>(UserModel.class),
                id);
    }

    // UPDATE USER
    public void updateUser(UserModel user) {

        String sql =
        "UPDATE users SET name=?, email=? WHERE id=?";

        jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail(),
                user.getId());
    }
    
    
}