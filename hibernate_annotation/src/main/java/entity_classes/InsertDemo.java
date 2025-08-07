package entity_classes;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_annotation");
    	EntityManager em = emf.createEntityManager();  // Use "emf"

        EntityTransaction et = em.getTransaction();

      
            
            Student s1 = new Student(1, "parl", 80.0);
            Student s2 = new Student(2, "Rahul", 90.0);  // Fixed duplicate ID issue
            et.begin();

            em.persist(s1);
            em.persist(s2);

            et.commit(); // Commit transaction
            System.out.println("Records inserted successfully!");

        
    }
}
