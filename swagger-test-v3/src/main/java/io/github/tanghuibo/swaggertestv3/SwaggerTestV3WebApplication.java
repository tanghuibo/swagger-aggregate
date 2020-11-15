package io.github.tanghuibo.swaggertestv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:10
 */
@SpringBootApplication
@EnableOpenApi
public class SwaggerTestV3WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestV3WebApplication.class, args);
    }

}
