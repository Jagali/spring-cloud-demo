package tech.techstack.service.hi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.techstack.service.hi.service.HelloService;

/**
 * @author chenjianyuan
 * @date 2020/1/14 20:59
 */
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return "[service-hi] -> " + helloService.hello(name);
    }
}
