package com.example.ahmed.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void JokeAsyncTaskTest() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(
                new EndpointsAsyncTask.Callback() {
                    @Override
                    public void onPost(String string) {

                    }
                });
        String joke = endpointsAsyncTask.execute().get();
        assertNotNull(joke);
    }
}
