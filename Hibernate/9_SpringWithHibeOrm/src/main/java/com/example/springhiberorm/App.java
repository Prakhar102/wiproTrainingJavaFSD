package com.example.springhiberorm;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springhiberorm.entity.Student;
import com.example.springhiberorm.service.StudentService;

public class App {

    /*
     * Controller / Entry Point
     */

    public static void main(String[] args) {

        /*
         * Loading Spring Container
         *
         * applicationContext.xml contains:
         * - bean configurations
         * - datasource
         * - hibernate configuration
         */

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml"
                );


        /*
         * Getting StudentService object
         * from Spring IOC Container
         */

        StudentService service =
                ctx.getBean(StudentService.class);


        Scanner sc = new Scanner(System.in);
        /*
         * Taking number of students
         */
        System.out.println("Enter Number of Students : ");
        int n = sc.nextInt();

        sc.nextLine(); // consume leftover newline


        /*
         * Loop for multiple students
         */

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Details of Student " + i);

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Student Email : ");
            String email = sc.nextLine();

            System.out.print("Enter Student Course : ");
            String course = sc.nextLine();


            /*
             * Creating Student Object
             */

            Student student =
                    new Student(name, email, course);


            /*
             * Saving data using Service Layer
             */

            service.create(student);


            System.out.println(
                    "Student Saved Successfully"
            );
        }


        /*
         * Displaying All Students
         */

        System.out.println(
                "\n___________ ALL STUDENT DATA ___________"
        );

        System.out.println(service.list());


        /*
         * Getting Student by ID
         */

        System.out.println(
                "\nEnter Student ID to Search : "
        );

        Long id = sc.nextLong();


        Student s = service.get(id);


        /*
         * Checking if student exists
         */

        if (s != null) {

            System.out.println(
                    "\nStudent Found : " + s
            );

        } else {

            System.out.println(
                    "\nStudent Not Found!"
            );
        }

        sc.close();
    }
}