package com.cognitocampus.admin.AdminController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AminController {

    @RequestMapping("/")
    public String one(){
        return "Hello World";
    }
}
