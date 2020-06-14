package guilherme.pedro.aulahelloworldcomlombok.controllers;

import guilherme.pedro.aulahelloworldcomlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World com Lombok!!!";
    }

//    @GetMapping("/product")
//    public String getproduct() {
//        return "Objeto Produto";
//    }

}
