package com.makaan.controllers;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class CustomService implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        System.out.println("Started#############");
    }

}
