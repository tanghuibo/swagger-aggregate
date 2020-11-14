package io.github.tanghuibo.swaggeraggregateweb.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * swagger 聚合文档配置
 * @author tanghuibo
 * @date 2020/11/12下午11:37
 */
@ConfigurationProperties(
        prefix = "swagger-aggregate",
        ignoreUnknownFields = true
)
public class SwaggerAggregateProperties {
    /**
     * 资源信息
     */
    private List<SwaggerAggregateResourceProperties> resources;

    public List<SwaggerAggregateResourceProperties> getResources() {
        return resources;
    }

    public void setResources(List<SwaggerAggregateResourceProperties> resources) {
        this.resources = resources;
    }
}
