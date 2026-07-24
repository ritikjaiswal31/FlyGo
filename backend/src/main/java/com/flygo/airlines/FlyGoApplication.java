// FlyGo backend application configuration

package com.flygo.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FlyGoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyGoApplication.class, args);
    }
}





