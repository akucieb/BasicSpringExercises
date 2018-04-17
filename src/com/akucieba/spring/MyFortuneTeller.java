package com.akucieba.spring;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyFortuneTeller implements FortuneService {
    private String fileName = "C:\\Users\\Anita\\IdeaProjects\\BasicSpringExercises\\src\\fortunes.txt";

    File file = new File(fileName);

    @Override
    public String getFortune() {
        return getRandom(readingFromFile(fileName));
    }

    private static String getRandom(String[] array) {
        int index = new Random().nextInt(array.length);
        return array[index];
    }

    private static String[] readingFromFile(String fileName) {
        List<String> theFortunes = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                theFortunes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] fortunesArr = new String[theFortunes.size()];
        return theFortunes.toArray(fortunesArr);
    }
}
