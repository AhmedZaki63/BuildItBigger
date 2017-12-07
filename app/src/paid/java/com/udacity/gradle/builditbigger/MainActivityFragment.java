package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidlibrary.JokeActivity;


public class MainActivityFragment extends Fragment {
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        button = (Button) root.findViewById(R.id.joke_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
                    @Override
                    public void onPost(String string) {
                        Intent intent = new Intent(getContext(), JokeActivity.class);
                        intent.putExtra("joke", string);
                        intent.putExtra("title", "Paid Joke");
                        startActivity(intent);
                    }
                }).execute();
            }
        });
        return root;
    }
}
