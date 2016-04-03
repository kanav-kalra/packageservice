package com.makaan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController implements ExitCodeGenerator {
    @Autowired
    private CustomService service;

    @RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String index(@RequestParam String trial) {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "app/v1/{trial}", method = RequestMethod.GET)
    public String trial(@PathVariable String trial) {
        return trial + "kanav";
    }

    @RequestMapping(value = "app/v1/hello/{trial}", method = RequestMethod.POST)
    public String trial(@RequestBody Request req, @PathVariable String trial) {
        return req.getName() + req.getNumber() + req.getValue();
    }

    @Override
    public int getExitCode() {
        System.out.println("byebye");
        return 0;
    }
}
