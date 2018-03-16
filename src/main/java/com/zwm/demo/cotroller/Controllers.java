package com.zwm.demo.cotroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @RequestMapping("/")
    String home() {
        return "Welcome!";
    }
}
