package com.company.hibernateorm;

// Importing Student entity class
import com.company.hibernateorm.model.Student;

// Importing Hibernate utility class
import com.company.hibernateorm.util.HibernateUtil;

// Hibernate classes
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class App {

    @SuppressWarnings("removal")
    public static void main(String[] args) {

        /*
         * STEP 1:
         * Open a session from SessionFactory.
         *
         * Session:
         * Session is used to communicate with database.
         *
         * SessionFactory:
         * Factory that creates Session objects.
         */

        Session session =
                HibernateUtil
                        .getSessionFactory()
                        .openSession();


        /*
         * STEP 2:
         * Begin Transaction
         *
         * Transaction ensures:
         * - data consistency
         * - commit
         * - rollback support
         */

        Transaction tx = session.beginTransaction();


        /*
         * Scanner object for user input
         */

        Scanner sc = new Scanner(System.in);


        /*
         * Taking Student Details from User
         */

        System.out.println("Enter Student Name");
        String name = sc.nextLine();

        System.out.println("Enter Student Email Id");
        String email = sc.nextLine();

        System.out.println("Enter Student Course");
        String course = sc.nextLine();


        /*
         * Creating Student Object
         *
         * At this moment object is in TRANSIENT state.
         *
         * Transient State:
         * Object exists in Java memory only.
         * Not saved in database yet.
         */

        Student s1 = new Student(name, email, course);


        /*
         * Persisting Object
         *
         * persist() converts:
         *
         * Transient State
         *        ↓
         * Persistent State
         *
         * Now Hibernate tracks this object.
         */

        session.persist(s1);


        /*
         * Fetching data from database using primary key
         *
         * session.get():
         * Retrieves object from database.
         */

        Student data =
                session.get(Student.class, s1.getId());


        /*
         * Displaying retrieved data
         */

        System.out.println("Student Data : " + data);


        /*
         * STEP 3:
         * Commit Transaction
         *
         * Without commit:
         * data will NOT save permanently.
         */

        tx.commit();


        /*
         * STEP 4:
         * Close Session
         */

        session.close();


        /*
         * STEP 5:
         * Close SessionFactory
         */

        HibernateUtil.close();


        /*
         * STEP 6:
         * Close Scanner
         */

        sc.close();
    }
}