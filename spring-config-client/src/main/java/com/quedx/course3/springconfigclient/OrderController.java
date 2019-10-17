package com.quedx.course3.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OrderController {

   @Value("${currency: unknown}")
   private String currency;

   @Value("${shippingState: unknown}")
   private String shippingState;

   @RequestMapping("/currency")
   @ResponseBody
   public String getCurrency() {
      return this.currency;
   }

   @RequestMapping("/shippingstate")
   @ResponseBody
   public String getShippingState() {
      return this.shippingState;
   }
}