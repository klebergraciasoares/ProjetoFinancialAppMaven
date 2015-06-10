package app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * @author Administrator
 *
 */
public class JPAMaxFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		try{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT p FROM Product p WHERE p.price < (SELECT MAX(p.price) FROM p)");
			List pList=query.getResultList();
			Iterator pIterator=pList.iterator();
			while(pIterator.hasNext()){
				Product pro=(Product)pIterator.next();
				System.out.print("Item name:"+pro.getItemName());
				System.out.print(" Price:"+pro.getPrice());
				System.out.println();
			}
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}
