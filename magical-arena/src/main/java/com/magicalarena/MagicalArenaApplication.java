package com.magicalarena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MagicalArenaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagicalArenaApplication.class, args);
    }

    @Bean
    public MagicalArena magicalArena() {
        return new MagicalArena();
    }
}

