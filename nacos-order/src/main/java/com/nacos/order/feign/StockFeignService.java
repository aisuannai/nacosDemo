package com.nacos.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//feign注解
@FeignClient("nacos-stock")
public interface StockFeignService {

    @GetMapping("/stock/test")
    String test(@RequestParam("info") String info);
}
