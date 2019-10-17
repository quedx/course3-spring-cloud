package com.quedx.course3.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RefreshScope
@RestController
public class OrderController {
 
   @Value("${seller: unknown}")
    private String seller;
 
    @RequestMapping("/seller")
    @ResponseBody
    public String getSeller() {
        return seller;
    }
 

}