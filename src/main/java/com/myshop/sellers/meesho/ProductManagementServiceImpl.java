package com.myshop.sellers.meesho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.myshop.sellers.dto.meesho.product.MeeshoProduct;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductManagementServiceImpl implements ProductManagementService {

    public static final String NEW_LINE = "\n";
    public static final String PRODUCTS_FILE = "resource://products.txt";
    public static final String FAILURE_FILE = "failure.txt";
    private final MeeshoProductService meeshoProductService;
    private final ProductIndexService productIndexService;

    public ProductManagementServiceImpl(MeeshoProductService meeshoProductService, ProductIndexService productIndexService) {
        this.meeshoProductService = meeshoProductService;
        this.productIndexService = productIndexService;
    }

    @Override
    public void refreshProducts() throws IOException {
        String index = productIndexService.readIndex();
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = null;
        BufferedReader br = null;
        try {
            inputStream = classLoader.getResourceAsStream(PRODUCTS_FILE);
            br = new BufferedReader(new InputStreamReader(inputStream));
            String productId;
            while ((productId = br.readLine()) != null) {
                if (StringUtils.isNotBlank(index)) while (br.readLine().equals(index)) ;
                try {
                    MeeshoProduct product = meeshoProductService.getProduct(productId);
                    mapAndIndexProduct(product);
                    productIndexService.writeIndex(productId);
                } catch (Exception e) {
                    log.error("Exception while indexing product {}", productId);
                    logDataInFile(productId, FAILURE_FILE);
                }
            }
        } catch (Exception e) {
            log.error("Exception while indexing products", e);
        } finally {
            br.close();
            inputStream.close();
        }
    }

    @Override
    public void addProducts(List<String> productIds) {
        if(CollectionUtils.isNotEmpty(productIds)) {
            productIds.forEach(productId -> logDataInFile(productId, PRODUCTS_FILE));
        }
    }

    void logDataInFile(String productId, String fileName) {
        try {

            File yourFile = new File("/src/main/resources/" + fileName);
            if (!yourFile.exists()) {
                yourFile.createNewFile();
            }
            FileOutputStream oFile = new FileOutputStream(yourFile, true);
            oFile.write(productId.getBytes(StandardCharsets.UTF_8));
            oFile.write(NEW_LINE.getBytes(StandardCharsets.UTF_8));
            oFile.close();
        } catch (Exception e) {

        }
    }

    private void mapAndIndexProduct(MeeshoProduct product) {

    }
}
