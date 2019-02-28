package com.crp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.crp
 *
 * @author rpchen3
 * @create 2019-02-27 14:53
 **/
@SpringBootApplication
@RestController
public class MsApplication {


    public static void main(String[] args) {

        SpringApplication.run(MsApplication.class, args);
    }

    @Value("${testName}")
    String testName;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String welcome() {
        System.out.println(123);
        return testName;
    }
}
