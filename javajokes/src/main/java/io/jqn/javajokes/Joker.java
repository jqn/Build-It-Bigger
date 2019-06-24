package io.jqn.javajokes;

import java.util.Random;

public class Joker {
    static Random random = new Random();
    private static String[] jokes = {"I went to a street where the houses were numbered 8k, 16k, 32k, 64k, 128k, 256k and 512k.\n" +
            "It was a trip down Memory Lane.", "If doctors were like software engineers, they would say things like\n \"Have you tried killing yourself and being reborn\"", "//be nice to the CPU\n" +
            "Thread_sleep(1);",
            "A programmer's wife asks: \"Would you go to the shop and pick up a loaf of bread? And if they have eggs, get a dozen.\"\n" +
                    "The programmer returns home with 12 loaves of bread.\n" +
                    "'They had eggs.'", "\"Debugging\" is like being the detective in a crime drama where you are also the murderer.", "!false\n" +
            "(It’s funny because it’s true.)", "The best thing about a Boolean is that even if you are wrong, you are only off by a bit.", "An optimist says \"The glass is half full.\"\n" +
            "A pessimist says \"The glass is half empty.\"\n" +
            "A programmer says \"The glass is twice as large as necessary.\"", "\"Knock, knock.\"\n" +
            "\"Who’s there?\"\n" +
            "[very long pause] \"Java.", "An SQL query goes into a bar, walks up to two tables and asks: \"Can I join you?\"", "Programming is like sex. One mistake and you have to support it for the rest of your life.", "What did the router say to the doctor?\n" +
            "\"It hurts when IP\""};

    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
