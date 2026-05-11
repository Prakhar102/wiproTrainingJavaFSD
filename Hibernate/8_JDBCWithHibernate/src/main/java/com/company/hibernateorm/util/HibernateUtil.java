package com.company.hibernateorm.util;

// Hibernate imports
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


    /*
     * SessionFactory object
     *
     * static:
     * Only one SessionFactory for entire application.
     *
     * final:
     * Cannot be changed after initialization.
     */

    private static final SessionFactory sessionFactory =
            build();


    /*
     * build() method
     *
     * Creates SessionFactory using
     * hibernate.cfg.xml
     */

    private static SessionFactory build() {

        try {

            /*
             * Configuration class:
             * Reads Hibernate configuration file.
             *
             * configure():
             * Loads hibernate.cfg.xml
             *
             * buildSessionFactory():
             * Creates SessionFactory object.
             */

            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        }

        catch (Exception ex) {

            /*
             * If SessionFactory creation fails
             * throw RuntimeException
             */

            throw new RuntimeException(
                    "Initial SessionFactory creation failed. "
                            + ex
            );
        }
    }


    /*
     * getSessionFactory()
     *
     * Returns SessionFactory object.
     */

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }


    /*
     * close()
     *
     * Closes SessionFactory
     * and releases resources.
     */

    public static void close() {

        sessionFactory.close();
    }
}