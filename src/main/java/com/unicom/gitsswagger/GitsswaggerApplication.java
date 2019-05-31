package com.unicom.gitsswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GitsswaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitsswaggerApplication.class, args);
    }

}
