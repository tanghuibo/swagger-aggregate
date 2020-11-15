package io.github.tanghuibo.swaggeraggregateweb.config;

import io.github.tanghuibo.swaggeraggregateweb.constant.SwaggerProxyConstant;
import io.github.tanghuibo.swaggeraggregateweb.properties.SwaggerAggregateProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:28
 */
@Primary
@Configuration
public class SwaggerResourceConfig implements SwaggerResourcesProvider {
    @Resource
    SwaggerAggregateProperties swaggerAggregateProperties;
    @Override
    public List<SwaggerResource> get() {
        AtomicInteger index = new AtomicInteger(0);
        return swaggerAggregateProperties.getResources().stream().map(item -> {
            String url = String.format("%s/%s", SwaggerProxyConstant.SWAGGER_API_PROXY_URL_PREFIX, index.getAndIncrement());
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(item.getName());
            swaggerResource.setLocation(url);
            swaggerResource.setSwaggerVersion(item.getVersion());

            return swaggerResource;
        }).collect(Collectors.toList());
    }
}
