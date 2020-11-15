package io.github.tanghuibo.swaggertestv2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2020/11/14下午7:11
 */
@Api(tags = "V2 测试接口")
@RestController
@RequestMapping("testV2")
public class TestV2Controller {

    @ApiOperation("测试接口 V2")
    @GetMapping("test")
    public String test() {
        return "hello world";
    }
}
