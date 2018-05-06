package io.agilehandy.auth2provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


/**
 * curl clientid:clientsecret@localhost:{port}/security/oauth/token
 *   -d grant_type=password
 *   -d username=user
 *   -d password={user password}
 *   -d scope=whatever
 *
 **/

@SpringBootApplication
@EnableAuthorizationServer
public class Oauth2ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ProviderApplication.class, args);
	}

}

