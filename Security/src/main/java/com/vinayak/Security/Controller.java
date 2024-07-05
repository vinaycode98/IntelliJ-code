package com.vinayak.Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/Demo")
    public String chrome(){
        return "this my program..";
    }
}
