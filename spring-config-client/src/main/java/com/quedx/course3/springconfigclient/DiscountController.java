package com.quedx.course3.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class DiscountController {
 
   @Value("${discountCode}")
    private String discountCode;
 
    @RequestMapping("/discount")
    @ResponseBody
    public String getDiscountCode() {
        return this.discountCode;
    }
 

}