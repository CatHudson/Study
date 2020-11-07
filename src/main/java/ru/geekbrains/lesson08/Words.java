package ru.geekbrains.lesson08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {

    public static Map <String, Integer> wordsCount (List <String> words) {
        Map <String, Integer> wordsCount = new HashMap<>();

        for (String wrd : words) {
            wordsCount.merge(wrd, 1, Integer::sum);
        }
        return wordsCount;
    }

    public static void main(String[] args) {

        System.out.println(wordsCount(List.of("Cat", "Dog", "Fish", "Dog", "Cat", "Cat", "Bird")));
    }
}
