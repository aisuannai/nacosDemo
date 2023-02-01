package com.nacos.stock.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockTestController {

    @GetMapping("/test")
    public String test(@RequestParam("info")String info){
        return "库存接受到:" + info;
    }
}
