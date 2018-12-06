package com.meng.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;

    public String getProductServerPort(Integer id){
        String forObject = restTemplate.getForObject("http://product-service/product/getProduct?id="+id, String.class);
        return forObject;
    }
}
