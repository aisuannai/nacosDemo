package com.nacos.order.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockController {


    /**
     * 统一限流页面 但是对@SentinelResource方法级别限流异常不生效
     * @return
     */
    @RequestMapping("/block")
    public JSONObject block(){
      JSONObject object = new JSONObject();
      object.put("errcode", "403");
      object.put("errmessage","请求次数太过频繁，请稍后再试!");
      return object;
    }
}
