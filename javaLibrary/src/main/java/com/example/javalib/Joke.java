package com.example.javalib;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Joke {
    private static List<String> jokeList = Arrays.asList(
            "Joke",
            "Good Joke",
            "Very Good Joke",
            "Really Good Joke",
            "The Best Joke");

    public static String getJoke() {
        int index = new Random().nextInt(jokeList.size());
        return jokeList.get(index);
    }
}
