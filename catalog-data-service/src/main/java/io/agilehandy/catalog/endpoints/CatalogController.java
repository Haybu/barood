package io.agilehandy.catalog.endpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
