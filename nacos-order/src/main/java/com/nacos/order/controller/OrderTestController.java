package com.nacos.order.controller;

import com.nacos.order.feign.StockFeignService;
import com.nacos.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderTestController {

    @Autowired
    private StockFeignService stockFeignService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/getStockInfo")
    public String getStockInfo(@RequestParam("info") String info){
        return stockFeignService.test(info);
    }

    @GetMapping("/test1")
    public String getTest(){
        return orderService.test();
    }

    @GetMapping("/test2")
    public String getTest2(){
        return orderService.test();
    }
}
