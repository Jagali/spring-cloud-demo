package tech.techstack.service.hi.service;

import feign.RequestTemplate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.techstack.service.hi.service.impl.HelloServiceImpl;

/**
 * @author chenjianyuan
 * @date 2020/1/14 21:02
 */
@FeignClient(value = "service-user-center", fallback = HelloServiceImpl.class)
public interface HelloService {

    /**
     * 接口
     *
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String hello(@RequestParam(required = false) String name);

}
