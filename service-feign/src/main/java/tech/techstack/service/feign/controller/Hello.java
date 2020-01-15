package tech.techstack.service.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.techstack.service.feign.service.HelloService;

/**
 * @author chenjianyuan
 * @date 2020/1/13 20:28
 */
@RestController
public class Hello {

    private final HelloService helloService;

    public Hello(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "service-feign") String name) {
        return "[service-feign] -> " + helloService.hello(name);
    }
}
