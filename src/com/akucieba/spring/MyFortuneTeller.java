package com.akucieba.spring;

import java.util.Random;

public class MyFortuneTeller implements FortuneService {
    private String[] fortuneArray = {
            "Be careful, it's not your happy day",
            "You may need some amulet today",
            "It will be hard day - do your best"};

    @Override
    public String getFortune() {
        return getRandom(fortuneArray);
    }

    public static String getRandom(String[] array) {
        int index = new Random().nextInt(array.length);
        return array[index];
    }
}
