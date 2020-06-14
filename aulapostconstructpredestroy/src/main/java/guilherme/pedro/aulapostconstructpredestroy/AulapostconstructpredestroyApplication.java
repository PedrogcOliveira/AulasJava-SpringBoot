package guilherme.pedro.aulapostconstructpredestroy;

import guilherme.pedro.aulapostconstructpredestroy.dao.ClientDAO;
import guilherme.pedro.aulapostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AulapostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AulapostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Pedro","Guilherme"));

		System.out.println("ClientDAO" + clientDAO);
		System.out.println("Client" + clientDAO.getClient().toString());
	}

}
