package com.example;

import com.example.model.ReportCard;
import com.example.model.Student;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();

            Student student = new Student(name);
            ReportCard reportCard = new ReportCard(marks);

            student.setReportcard(reportCard);

            System.out.println();
            System.out.println("Checking one-to-one mapping before saving:");
            System.out.println("Unidirectional style: Student can access ReportCard");
            System.out.println("Student name: " + student.getName());
            System.out.println("ReportCard marks from Student: " + student.getReportcard().getMarks());

            System.out.println();
            System.out.println("Bidirectional style: ReportCard can also access Student");
            System.out.println("ReportCard marks: " + reportCard.getMarks());
            System.out.println("Student name from ReportCard: " + reportCard.getStudent().getName());
            System.out.println();

            transaction = session.beginTransaction();
            session.persist(student);
            transaction.commit();

            System.out.println("Student and report card saved successfully.");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            scanner.close();
            HibernateUtil.close();
        }
    }
}
