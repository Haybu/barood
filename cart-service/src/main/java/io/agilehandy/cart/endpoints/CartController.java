package io.agilehandy.cart.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
