package tech.techstack.service.hi.service.impl;

import org.springframework.stereotype.Component;
import tech.techstack.service.hi.service.HelloService;

/**
 * @author chenjianyuan
 * @date 2020/1/14 21:05
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "[service-hi] 熔断启动" + name;
    }
}
