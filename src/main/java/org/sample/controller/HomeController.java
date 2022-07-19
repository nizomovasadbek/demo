package org.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHome(HttpServletRequest http){
        String str = http.getRemoteAddr() + "<br>";
        return str;
    }
}
