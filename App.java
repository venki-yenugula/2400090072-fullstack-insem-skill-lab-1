package com.student.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Student s = new Student(1, "Ravi", "CSE");

        session.save(s);

        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println("Student Data Inserted");
    }
}
