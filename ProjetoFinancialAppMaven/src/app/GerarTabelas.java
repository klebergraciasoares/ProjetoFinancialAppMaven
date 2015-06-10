package app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {

	/*
	 * Gerador de tabela ok.
	 */
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		factory.close();
		
	}
}
