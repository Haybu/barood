package io.agilehandy.cart.endpoints;

import io.agilehandy.cart.clients.CatalogClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	private final CatalogClient catalog;

	public CartController(CatalogClient catalog) {
		this.catalog = catalog;
	}

	@GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/add/{pname}")
    public String addProduct(@PathVariable("pname") String pname) {
        return  this.remoteCall(pname);
    }

    public String remoteCall(String product) {
		ResponseEntity<Resource<String>> resource = catalog.getProduct(product);
		return resource.getBody().getContent();
	}

}
