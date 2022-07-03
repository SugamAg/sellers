package com.myshop.sellers.meesho;

import java.io.IOException;
import java.net.URISyntaxException;

import com.myshop.sellers.client.HttpClient;
import com.myshop.sellers.client.Method;
import com.myshop.sellers.client.Request;
import com.myshop.sellers.client.Response;
import com.myshop.sellers.dto.meesho.product.MeeshoProduct;
import com.myshop.sellers.dto.meesho.similarproduct.MeeshoSimilarProducts;
import com.myshop.sellers.util.MapperUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MeeshoProductServiceImpl implements MeeshoProductService{

    private final HttpClient httpClient;

    private final String productUrl;
    private final String similarProductUrl;
    private final String baseUrl;

    public MeeshoProductServiceImpl(@Value("${meesho.base.url}") String baseUrl,
                                    @Value("${meesho.product.url}") String productUrl,
                                    @Value("${meesho.similar.product.url}") String similarProductUrl) {
        this.baseUrl = baseUrl;
        this.productUrl = productUrl;
        this.similarProductUrl = similarProductUrl;
        this.httpClient = new HttpClient(true);
    }

    @Override
    public MeeshoProduct getProduct(String productId) throws URISyntaxException, IOException {
        Request request = Request.builder().baseUri(baseUrl).endpoint(productUrl + "/" + productId).method(Method.GET).build();
        Response response = httpClient.get(request);
        MeeshoProduct meeshoProduct = null;
        if(response.getStatusCode() == 200) {
            meeshoProduct = MapperUtil.deSerialize(MeeshoProduct.class, response.getBody());
        }
        return meeshoProduct;
    }

    @Override
    public MeeshoSimilarProducts getSimilarProducts(String productId) throws URISyntaxException, IOException {
        Request request = Request.builder().baseUri(baseUrl).endpoint(similarProductUrl + "/" + productId).method(Method.GET).build();
        Response response = httpClient.get(request);
        MeeshoSimilarProducts meeshoProduct = null;
        if(response.getStatusCode() == 200) {
            meeshoProduct = MapperUtil.deSerialize(MeeshoSimilarProducts.class, response.getBody());
        }
        return meeshoProduct;
    }
}
