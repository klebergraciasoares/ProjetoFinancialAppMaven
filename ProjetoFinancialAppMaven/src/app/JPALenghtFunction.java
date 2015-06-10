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
public class JPALenghtFunction {

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
			Query query=em.createQuery("SELECT st FROM Student st WHERE LENGTH(st.sname)=5");
			List stuList=query.getResultList();
			Iterator stuIterator=stuList.iterator();
			while(stuIterator.hasNext()){
				Student st=(Student)stuIterator.next();
				System.out.print("sname:"+st.getSname());
				System.out.println();
			}
			entr.commit();
		}
		finally{
			em.close();
		}
	}

}
