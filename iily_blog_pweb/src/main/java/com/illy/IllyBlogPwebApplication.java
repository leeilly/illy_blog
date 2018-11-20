package com.illy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.illy" })
@Slf4j
public class IllyBlogPwebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(IllyBlogPwebApplication.class, args);
    }

}
