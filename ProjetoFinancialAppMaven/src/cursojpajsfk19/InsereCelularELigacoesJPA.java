package cursojpajsfk19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cursojpajsfk19.entitys.Call;
import cursojpajsfk19.entitys.Celular;

public class InsereCelularELigacoesJPA {

	public static void main(String[] args) throws ClassNotFoundException {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		
		Celular novoCelular = new Celular();
		Call novoLigacao1 = new Call();
		Call novoLigacao2 = new Call();

		novoCelular.setNumber("32331515");

		 List<String> ligacoesList = new ArrayList<String>();
		 ligacoesList.add("sup1");
		 ligacoesList.add("sup2");
		 ligacoesList.add("sup3");
		 System.out.println(ligacoesList.get(1));

        // for loop advance
		for (String temp : ligacoesList) {
			System.out.println("Lista empresas: "+temp);
		}   		
		

		novoLigacao1.setDuration(20);
		novoLigacao1.setCellular(novoCelular); 
		
		novoLigacao2.setDuration(10);
		novoLigacao2.setCellular(novoCelular);

		Call[] relacaoLigacoes = { novoLigacao1,novoLigacao2 };
		List<Call> listaLigacoes = new ArrayList<Call>(Arrays.asList(relacaoLigacoes));
		novoCelular.setCalls(listaLigacoes);
		
		manager.persist(novoCelular);
		manager.getTransaction().begin();
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}
}
