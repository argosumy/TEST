package com.my_project.task.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/hello")
    public String getMethod () {
        return "HELLO";
    }
}
