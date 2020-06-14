package guilherme.pedro.aulapostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @Author Pedro Guilherme
 * @Version 1.0
 */

@ToString
@Getter
@Setter
@AllArgsConstructor

@Component
public class Client {

    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe Cliente");
    }

}
