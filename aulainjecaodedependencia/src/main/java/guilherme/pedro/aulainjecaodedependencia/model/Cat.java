package guilherme.pedro.aulainjecaodedependencia.model;

import guilherme.pedro.aulainjecaodedependencia.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
@Qualifier("Cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miau miau!!");
    }
}
