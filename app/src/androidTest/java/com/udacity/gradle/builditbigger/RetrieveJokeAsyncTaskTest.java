package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;

import org.junit.Rule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class RetrieveJokeAsyncTaskTest {

    public static final String EMPTY_JOKE = "";

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onJokeBtnClick() {
        // "Add code to test that your Async task successfully retrieves a non-empty string."

        // If you tap the TELL JOKE button in MainActivity ...
        onView(withId(R.id.joke_btn)).perform(click());

        // ... does it bring up DisplayJokeActivity, and display the retrieved joke?
        onView(withId(R.id.joke)).check(matches(not(withText(EMPTY_JOKE))));
    }
}
