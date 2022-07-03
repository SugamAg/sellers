package com.myshop.sellers.meesho;

import java.io.IOException;
import java.net.URISyntaxException;

import com.myshop.sellers.dto.meesho.product.MeeshoProduct;
import com.myshop.sellers.dto.meesho.similarproduct.MeeshoSimilarProducts;

public interface MeeshoProductService {
    MeeshoProduct getProduct(String productId) throws URISyntaxException, IOException;

    MeeshoSimilarProducts getSimilarProducts(String productId) throws URISyntaxException, IOException;
}
