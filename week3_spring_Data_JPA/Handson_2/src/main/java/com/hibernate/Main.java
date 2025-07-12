package com.hibernate;

import java.util.List;
import org.hibernate.*;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            // CREATE
            tx = session.beginTransaction();
            Employee emp = new Employee();
            emp.setFirstName("John");
            emp.setLastName("Doe");
            emp.setSalary(60000);
            session.save(emp);
            tx.commit();
            System.out.println("Employee saved!");

            // READ
            List<Employee> list = session.createQuery("FROM Employee", Employee.class).list();
            for (Employee e : list) {
                System.out.println(e.getFirstName() + " " + e.getLastName());
            }

            // UPDATE
            tx = session.beginTransaction();
            emp.setSalary(75000);
            session.update(emp);
            tx.commit();
            System.out.println("Employee updated!");

            // DELETE
            tx = session.beginTransaction();
            session.delete(emp);
            tx.commit();
            System.out.println("Employee deleted!");

        } catch (Exception ex) {
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
