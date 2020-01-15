package tech.techstack.serivce.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjianyuan
 * @date 2020/1/13 20:44
 */
@Service
public class HelloService {
    private final RestTemplate restTemplate;

    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    }


    public String error(String name) {
        return "hi," + name + "is error.";
    }
}
