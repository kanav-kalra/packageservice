package com.makaan;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

//same as @Configuration @EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

    public static void main(String[] args) {
        // SpringApplication.run(ProptigerBootApplication.class, args);
        SpringApplication app = new SpringApplication(BootApplication.class);
        app.setWebEnvironment(true);
        app.setBannerMode(Mode.OFF);
        app.run(args);
    }
}
