package io.jqn.javajokes;

import java.util.Random;

public class Joker {
    static Random random = new Random();
    private static  String[] jokes =  {"A boolean and a float walk into the Mos Eisley Cantina.\n\nThe bartender throws them out, saying, \"We don't serve your types here!\"",
            "An Intent walks into a bar.\n\nThe bartender scowls and says, \"All right pal, I'll serve you, but don't start anything.\"",
            "Luke Skywalker has been having a terrible time trying to figure out GitHub to get the example projects for his Nanodegree set up on his computer.\n\nHis mentor Obi-Wan says, \"Use the forks, Luke.\"",
            "The \"Also known as:\" label TextView from the Sandwich Club starter code walks into a bar.\n\nThe bartender says, \"Sorry, but I can't serve you, because you don't have an ID.\"",
            "Why did the Sandwich Club app make the Avengers sad?\n\nIt said, \"Error: 404, Shawarma Not Found.\"",
            "The bartender says, \"We don't serve AsyncTasks in here.\"\n\nAn AsyncTask walks into a bar.",
            "A student walks into the Grow_with_Google_Nanodegrees Slack #night_owls bar after a three-day weekend, and says, \"I'll have my usual.\"\n\nThe bartender says, \"Sorry, your workspace is over its storage limit. Please upgrade to a paid plan if you want us to be able to remember anything that happened more than a couple days ago.\"",
            "A student posts to the Grow_with_Google_Nanodegrees Slack #github channel, \"Can anyone help me understand how to use 'Git Bash'? Is it supposed to be like 'Hulk Smash!', or do you only do a little bit of bashing?\"",
            "onDestroy() walks into a bar.\n\n\"Hey, where did everybody go?\"",
            "Android, where ProgressBars go around in circles, and Spinners don't spin.",
            "Spiders are the only web developers who enjoy finding bugs.",
            "An Espresso Test walks into a bar. Orders a beer. Orders 0 beers. Orders 999999999 beers. Orders a Nanodegree. Orders .5 beers. Orders -1 beers. Orders a dkfjkjdbkdskfjb.",
            "A student posts to the Grow_with_Google_Nanodegrees Slack #meet_ups channel, \"I apologize to anyone who tried to attend our meetup at the MongoDB cafe last night -- I didn't realize that there wouldn't be any tables.\"",
            "A student posts to the Grow_with_Google_Nanodegrees Slack #meet_ups channel, \"It was nice to meet some other students and help each other with our projects for Coffee Date yesterday, but the service was terrible! We kept asking for #000000 coffee, but they never brought us anything.\"",
            "The #100DaysOfCode Grow_with_Google_Nanodegrees Slack channel, where you spend a half hour coding, and then another half hour reading everyone's #100DaysOfCode postings.",
            "Wow, once again the Build it Bigger project was getting a lot of weird error messages, but Build/Clean Project fixed everything.\n\nNow I'm wondering whether this project should be doing the equivalent of taking a shower every morning.",
            "Was there table service at the coffee shop where the Grow With Google FEND students had their meetup?\n\nNO, they had to FEND for themselves."};

    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
