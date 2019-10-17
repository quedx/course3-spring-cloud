package com.quedx.course3.springconfigclientorderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController {

   @Value("${shipping.state}")
   private String shippingState;

   @Value("${currency}")
   private String currency;

   @RequestMapping("/shippingstate")
   @ResponseBody
   public String getDiscountCode() {
      return this.shippingState;
   }

   @RequestMapping("/currency")
   @ResponseBody
   public String getCurrency() {
      return this.currency;
   }

}