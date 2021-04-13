package ru.rb.onion.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.rb.onion")
@SpringBootApplication
public class App {
        public static void main(String[] args) {
            SpringApplication.run(App.class, args);

    }
}
