package com.example.paige.mazeapp;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onStart();

    }


    public void onStart() {
        super.onStart();
/*

        ImageView imageView = (ImageView)findViewById(R.id.image_runner);
        Ion.with(imageView)
                .error(R.drawable.ic_launcher_background)
                .animateGif(AnimateGifMode.ANIMATE)
                .load("file:///android_res/drawable/mario_running.gif");*/


        WebView runnerImage = (WebView) findViewById(R.id.image_runner);
        runnerImage.setBackgroundColor(Color.TRANSPARENT);
        runnerImage.getSettings().setLoadWithOverviewMode(true);
        runnerImage.getSettings().setUseWideViewPort(true);
        runnerImage.setInitialScale(25);
        runnerImage.loadUrl("file:///android_res/drawable/mario_running.gif");
    }
    public void startMaze(View view) {
       /* Button button = (Button) findViewById(R.id.enter_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView imageView = (ImageView)findViewById(R.id.image_runner);
                Ion.with(imageView)
                        .crossfade(true)
                        .error(R.drawable.error)
                        .animateGif(AnimateGifMode.ANIMATE_ONCE)
                        .load("file:///android_res/drawable/mario_running.gif");
            }
        });*/
    }
}
