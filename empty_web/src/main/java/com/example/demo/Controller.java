package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : MrLawrenc
 * @date : 2020/5/3 10:21
 * @description : TODO
 */
@RestController
public class Controller {

    @Value("${server.port}")
    private int port;

    @GetMapping("/")
    public String tt() {
        return "当前端口:" + port;
    }
}