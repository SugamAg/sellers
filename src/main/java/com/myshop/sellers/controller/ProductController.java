package com.myshop.sellers.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.myshop.sellers.dto.meesho.product.MeeshoProduct;
import com.myshop.sellers.meesho.MeeshoProductService;
import com.myshop.sellers.meesho.ProductManagementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    private final MeeshoProductService meeshoProductService;
    private final ProductManagementService productManagementService;

    @GetMapping("/product/{productId}")
    public MeeshoProduct getProduct(@PathVariable("productId") String productId) throws URISyntaxException, IOException {
        return meeshoProductService.getProduct(productId);
    }

    @GetMapping("/refresh/products")
    public void refreshProducts() throws IOException {
        productManagementService.refreshProducts();
    }

    @PostMapping("/products/add")
    public void addProducts(@RequestBody List<String> productIds) throws IOException {
        productManagementService.addProducts(productIds);
    }
}
