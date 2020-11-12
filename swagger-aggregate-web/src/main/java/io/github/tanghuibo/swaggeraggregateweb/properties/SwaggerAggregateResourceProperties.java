package io.github.tanghuibo.swaggeraggregateweb.properties;

/**
 * @author tanghuibo
 * @date 2020/11/12下午11:37
 */
public class SwaggerAggregateResourceProperties {

    /**
     * 文档名称
     */
    private String name;

    /**
     * 文档地址
     */
    private String url;

    /**
     * 文档版本
     */
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
