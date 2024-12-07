package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    public Product[] getAllProducts() {
        String url = "https://fakestoreapi.com/products";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Product[].class);
    }
}
