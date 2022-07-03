package com.myshop.sellers.meesho;

import java.io.IOException;
import java.util.List;

public interface ProductManagementService {

    void refreshProducts() throws IOException;

    void addProducts(List<String> productIds);

}