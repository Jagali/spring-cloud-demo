package tech.techstack.open.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjianyuan
 * @date 2020/1/15 14:13
 */
@RestController
public class HelloController {
    final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("[open-api]");
    }

    @FeignClient("service-feign")
    interface HelloService {

        @GetMapping("/hello")
        String hello(@RequestParam("name") String name);
    }
}
