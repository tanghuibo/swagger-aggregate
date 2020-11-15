package io.github.tanghuibo.swaggeraggregateweb.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:47
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate build() {
        return new RestTemplateBuilder().build();
    }
}
