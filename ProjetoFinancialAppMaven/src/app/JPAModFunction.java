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
public class JPAModFunction {

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
			Query query=em.createQuery("SELECT p FROM Product p WHERE MOD(p.price,10) = 0");
			List pList=query.getResultList();
			Iterator pIterator=pList.iterator();
			while(pIterator.hasNext()){
				Product pro=(Product)pIterator.next();
				System.out.println("itemName:"+pro.getItemName());
			}
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}
