package io.jqn.displayjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView joke = findViewById(R.id.joke);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey(JOKE_KEY)) {
            joke.setText(bundle.getString((JOKE_KEY)));
        }
    }
}
