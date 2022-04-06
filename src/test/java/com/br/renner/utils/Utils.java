package com.br.renner.utils;

import com.github.javafaker.Faker;

public class Utils {
    public String generateRandomEmail(){
        Faker faker = new Faker();
        String faking = faker.internet().emailAddress();
        return faking;
    }

    public String generateRandomCelphone(){
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }
}
