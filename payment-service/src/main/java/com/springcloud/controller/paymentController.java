package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class paymentController {
	
	@Value("${message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message+" Payment Service";
    }
}
