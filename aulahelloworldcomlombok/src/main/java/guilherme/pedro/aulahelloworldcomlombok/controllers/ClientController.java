package guilherme.pedro.aulahelloworldcomlombok.controllers;

import guilherme.pedro.aulahelloworldcomlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 *
 */
@RestController
public class ClientController {

    @GetMapping("/client")
    public Client getClient() {

        Client client = new Client();
        client.setName("Pedro");
        client.setLastName("Oliveira");
        client.setAge(19);

        return client;
    }

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();
        Client client = new Client();
        client.setName("Pedro");
        client.setLastName("Oliveira");
        client.setAge(19);

        Client client1 = new Client();
        client1.setName("João");
        client1.setLastName("Assis");
        client1.setAge(25);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
