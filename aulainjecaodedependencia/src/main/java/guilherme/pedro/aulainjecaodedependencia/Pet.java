package guilherme.pedro.aulainjecaodedependencia;

import guilherme.pedro.aulainjecaodedependencia.interfaces.AnimalInterface;
import guilherme.pedro.aulainjecaodedependencia.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("Cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }
//    public void execute() {
//        animalInterface = new Cat();
//        animalInterface.comunicar();
//    }

    public void execute() {
        animalInterface.comunicar();
    }
}
