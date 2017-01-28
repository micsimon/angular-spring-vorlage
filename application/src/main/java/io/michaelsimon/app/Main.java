package io.michaelsimon.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.michaelsimon.app")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
