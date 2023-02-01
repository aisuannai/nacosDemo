package com.nacos.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.nacos.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    //链路模式，监控此方法，无论谁调用，到达阈值就会限流
    //blockHandler 只处理限流异常
    //fallback 处理其他异常
    //blockHandler 在fallback之前生效，因为blockHandler在方法执行之前执行的
    @SentinelResource(value = "orderTest", blockHandler = "blockHandler", fallback = "exception")
    public String test() {
        int i = 1/0;
        return "test";
    }

    //注意参数和返回值需要保持一致，并且参数最后还需要额外添加一个BlockException
    public String blockHandler(BlockException e){
        return "被限流";
    }

    public String exception(Throwable t){
        return  "出现异常";
    }
}
