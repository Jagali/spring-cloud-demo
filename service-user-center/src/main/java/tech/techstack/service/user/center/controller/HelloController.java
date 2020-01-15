package tech.techstack.service.user.center.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjianyuan
 * @date 2020/1/14 20:59
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "MR.C") String name) {
        return "[service-user-center] -> " + name;
    }
}
