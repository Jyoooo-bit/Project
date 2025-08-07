package entity_classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDemo {
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate_annotation");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=em.find(Student.class, 2);
		s.setPercentage(95.0);
		et.begin();
		em.merge(s);
		et.commit();

	}

}
