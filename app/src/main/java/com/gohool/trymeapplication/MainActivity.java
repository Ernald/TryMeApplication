package com.gohool.trymeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View viewBackgroundCont;
    private Button tryMe;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[] { Color.RED, Color.BLACK, Color.BLUE, Color.GRAY, Color.WHITE, Color.YELLOW};

        viewBackgroundCont = findViewById(R.id.windowViewId);


        tryMe = (Button) findViewById(R.id.tryMeButton);
        tryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colArrayLength);
                viewBackgroundCont.setBackgroundColor(colors[randomNum]);

                Log.d("Random", String.valueOf(randomNum));
            }
        });



    }
}