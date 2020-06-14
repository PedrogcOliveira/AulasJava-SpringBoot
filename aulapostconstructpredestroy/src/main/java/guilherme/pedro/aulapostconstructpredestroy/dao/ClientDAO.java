package guilherme.pedro.aulapostconstructpredestroy.dao;

import guilherme.pedro.aulapostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author Pedro Guilherme
 * @Version 1.0
 */
@Getter @Setter
@Component
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto foi criado!!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado!");
    }
}
