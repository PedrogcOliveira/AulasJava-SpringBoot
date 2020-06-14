package guilherme.pedro.aulaescopo;

import guilherme.pedro.aulaescopo.dao.ClassDAO;
import guilherme.pedro.aulaescopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AulaescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AulaescopoApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);


		System.out.println("Objeto da classe JDBC" + objJDBC);
		System.out.println("Objeto da classe JDBC1" + objJDBC1);
		System.out.println("Objeto da classe DAO" + objDAO);
		System.out.println("Objeto da classe DAO1" + objDAO1);
	}

}
