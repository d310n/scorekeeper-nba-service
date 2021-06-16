package com.nba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Nba
{
    public static void main(String[] args)
    {
        SpringApplication.run(Nba.class, args);
        System.out.println("Nba rapid api works!");
    }
}
