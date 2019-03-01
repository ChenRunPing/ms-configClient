package com.crp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

}
