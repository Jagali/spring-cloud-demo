package tech.techstack.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.techstack.service.feign.service.impl.HelloServiceImpl;

/**
 * @author chenjianyuan
 * @date 2020/1/13 20:26
 */
@FeignClient(value = "service-ribbon", fallback = HelloServiceImpl.class)
public interface HelloService {

    /**
     * 测试
     *
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String hello(@RequestParam(required = false) String name);
}
