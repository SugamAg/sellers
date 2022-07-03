package com.myshop.sellers.meesho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductIndexServiceImpl implements ProductIndexService {


    public static final String FILE_STR = "_index.txt";

    @Override
    public void writeIndex(String index) {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            File yourFile = new File(getFileName());
            if (!yourFile.exists()) {
                yourFile.createNewFile();
            }
            FileOutputStream oFile = new FileOutputStream(yourFile, false);
            oFile.write(index.getBytes(StandardCharsets.UTF_8));
            oFile.close();
        } catch (Exception e) {

        }
    }

    @Override
    public String readIndex() {
        File yourFile = new File(getFileName());
        if (!yourFile.exists()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(yourFile);
            return new String(fileInputStream.readAllBytes());
        } catch (Exception e) {
            log.error("Exception while reading index", e);
            return "";
        }
    }

    private String getFileName() {
        return LocalDate.now() + FILE_STR;
    }

}
