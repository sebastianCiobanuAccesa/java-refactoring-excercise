package com.mcserby.training;

import com.mcserby.training.refactoring2.InternationalValues;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);

        InternationalValues internationalValues= applicationContext.getBean(InternationalValues.class);
        System.out.println(internationalValues.getLocaleToInfo());

        System.out.println(internationalValues.getLocaleToInfo().get("en_uk"));


    }
}
