package io.agilehandy.cart.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CartController {

    private final RestTemplate template;

	public CartController(RestTemplate template) {
		this.template = template;
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
		String url = "http://catalog-data-service/catalog/products/search/findByName?name={pname}";
		Map<String, String> params = new HashMap();
		params.put("pname", product);

		final ResponseEntity<String> responseEntity = template
				.getForEntity(url, String.class, params);

		return responseEntity.getBody();
	}

}
