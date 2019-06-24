package io.jqn.javajokes;

import java.util.Random;

public class Joker {
    static Random random = new Random();
    private static  String[] jokes =  {"I went to a street where the houses were numbered 8k, 16k, 32k, 64k, 128k, 256k and 512k.\n" +
            "It was a trip down Memory Lane."};

    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
