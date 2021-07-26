package com.demo.democonfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {
 
	@Value("${message}")
    private String message;
 
    @GetMapping("/msg")
    public String getMsg() {
        return this.message;
    }
}