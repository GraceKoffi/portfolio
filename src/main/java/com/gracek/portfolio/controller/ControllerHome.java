package com.gracek.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHome {
     @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects() {
        return "/maintenance";
        //return "projects";
    }

    @GetMapping("/contact")
    public String contact() {
        return "/maintenance";
        //return "contact";
    }

    @GetMapping("/{path:[^\\.]*}")
    public String fallback() {
        return "error";
    }

    @RequestMapping("/maintenance")
    public String maintenance() {
        return "maintenance";
    }
}
