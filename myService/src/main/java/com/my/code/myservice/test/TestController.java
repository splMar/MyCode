package com.my.code.myservice.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SUN
 * @since 2024-05-21
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "ceshi";
    }
}
