package com.hedgo.jmslistenersb.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

import java.util.Scanner;

@SpringBootApplication
@EnableJms
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Start to listen for JMS messages with Spring Boot and Apache Active MQ!");
        ConfigurableApplicationContext context = SpringApplication.run(MainApp.class, args);
    }
}
