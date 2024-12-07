package com.klef.jfsd.exam;

import com.klef.jfsd.exam.model.Product;
import com.klef.jfsd.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/view")
    public Product[] viewAllProducts() {
        return productService.getAllProducts();
    }
}
