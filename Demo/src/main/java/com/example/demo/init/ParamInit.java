package com.example.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务器启动时,参数配置读取
 */

@Component
public class ParamInit implements ApplicationRunner {

    // fuq-test01分支提交的代码,14:16
    private String fuq_1416;
    // fuq_test02分支提交的代码,14:35
    private String fuq_1435;

    @Autowired
    private Environment environment;

    public static Map<String, String> CACHE = new HashMap<>();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        CACHE.put("driver-class-name",environment.getProperty("spring.datasource.driver-class-name"));
        CACHE.put("url",environment.getProperty("spring.datasource.url"));
        CACHE.put("username",environment.getProperty("spring.datasource.username"));
        CACHE.put("password",environment.getProperty("spring.password"));
    }

    public Map<String,String> getCACHE(){
        return CACHE;
    }
}
