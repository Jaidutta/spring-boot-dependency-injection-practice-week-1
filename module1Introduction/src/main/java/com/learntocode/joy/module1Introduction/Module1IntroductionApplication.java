package com.learntocode.joy.module1Introduction;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {


    final CakeBaker cakeBaker; //dependency injection

    public Module1IntroductionApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker; // constructor DI/// Preferred
    }



    public static void main(String[] args) {
        SpringApplication.run(Module1IntroductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        cakeBaker.bakeCake();


    }
}
