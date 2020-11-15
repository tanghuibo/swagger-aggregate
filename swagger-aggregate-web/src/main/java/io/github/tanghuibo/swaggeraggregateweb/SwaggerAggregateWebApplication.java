package io.github.tanghuibo.swaggeraggregateweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class SwaggerAggregateWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerAggregateWebApplication.class, args);
	}

}
