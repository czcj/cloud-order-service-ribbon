package com.meng.orderservice;

import com.meng.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("pullProduct")
    public String pullProduct(){
        String productServerPort = orderService.getProductServerPort(1);
        return productServerPort;
    }
}
