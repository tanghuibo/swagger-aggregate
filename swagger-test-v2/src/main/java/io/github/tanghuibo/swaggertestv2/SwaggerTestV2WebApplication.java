package io.github.tanghuibo.swaggertestv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:20
 */
@EnableSwagger2
@SpringBootApplication
public class SwaggerTestV2WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestV2WebApplication.class, args);
    }
}
