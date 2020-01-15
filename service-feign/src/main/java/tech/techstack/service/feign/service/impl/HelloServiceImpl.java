package tech.techstack.service.feign.service.impl;

import org.springframework.stereotype.Component;
import tech.techstack.service.feign.service.HelloService;

/**
 * @author chenjianyuan
 * @date 2020/1/13 20:55
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "error: " + name;
    }
}
