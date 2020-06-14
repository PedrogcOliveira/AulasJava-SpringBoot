package guilherme.pedro.aulainjecaodedependencia.model;

import guilherme.pedro.aulainjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Primary
@Qualifier("Dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Au auu");
    }
}
