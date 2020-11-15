package io.github.tanghuibo.swaggeraggregateweb.controller;

import io.github.tanghuibo.swaggeraggregateweb.constant.SwaggerProxyConstant;
import io.github.tanghuibo.swaggeraggregateweb.properties.SwaggerAggregateProperties;
import io.github.tanghuibo.swaggeraggregateweb.properties.SwaggerAggregateResourceProperties;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:36
 */
@RestController
@RequestMapping(SwaggerProxyConstant.SWAGGER_API_PROXY_URL_PREFIX)
public class SwaggerProxyController {
    @Resource
    RestTemplate restTemplate;
    @Resource
    SwaggerAggregateProperties swaggerAggregateProperties;

    @GetMapping("{index}")
    public void proxy(@PathVariable("index") Integer index, HttpServletResponse response) throws IOException {

        List<SwaggerAggregateResourceProperties> resources = swaggerAggregateProperties.getResources();
        if(index >= resources.size() || StringUtils.isEmpty(resources.get(index).getUrl())) {
            response.getWriter().println("invalid index");
            return;
        }
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print(restTemplate.getForObject(resources.get(index).getUrl(), String.class));
    }
}
