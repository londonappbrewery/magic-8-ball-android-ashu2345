package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ballimages = {
                                R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5
        };
        final Button ask = (Button) findViewById(R.id.ask_button);
        final ImageView ball_image = (ImageView) findViewById(R.id.ball_image);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(5);
                ball_image.setImageResource(ballimages[num]);
            }
        });
    }
}
