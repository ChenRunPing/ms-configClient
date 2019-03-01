package com.crp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.crp
 *
 * @author rpchen3
 * @create 2019-03-01 10:33
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @Value("${testName}")
    private String testName;

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome(){
        System.out.println(System.currentTimeMillis());
        return "hello,spring cloud config!";
    }



}
