package tech.techstack.serivce.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjianyuan
 * @date 2020/1/14 20:37
 */
@RestController
public class HelloController {

    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "Service Ribbon") String name) {
        return "[service-ribbon] -> " + restTemplate.getForObject("http://service-hi/hello?name=" + name, String.class);
    }

    public String error(String name) {
        return "hi," + name + " is error.";
    }

}
