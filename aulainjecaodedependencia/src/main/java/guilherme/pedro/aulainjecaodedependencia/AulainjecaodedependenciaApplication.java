package guilherme.pedro.aulainjecaodedependencia;

import guilherme.pedro.aulainjecaodedependencia.model.Cat;
import guilherme.pedro.aulainjecaodedependencia.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

/**
 *
 */
@SpringBootApplication
public class AulainjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(AulainjecaodedependenciaApplication.class, args);
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
//
//		Pet pet = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet1 = new Pet(new Dog());
//		pet1.execute();
//


	}

}
