package io.agilehandy.cart.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "catalog-data-service", configuration = FeignConfiguration.class)
public interface CatalogClient {

	@RequestMapping(method = RequestMethod.GET
			, value = "/catalog/products/search/findByName?name={pname}")
	ResponseEntity<Resource<String>> getProduct(@RequestParam("pname") String pname);
}
