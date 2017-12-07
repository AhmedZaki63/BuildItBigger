package com.example.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView textView = (TextView) findViewById(R.id.joke_txt);
        String joke = getIntent().getStringExtra("joke");
        textView.setText(joke == null ? "There's no joke!" : joke);
        String title = getIntent().getStringExtra("title");
        setTitle(title);
    }
}
