package com.example.targil2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    int x;
    Random rnd =  new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.iv);
        ib=(ImageButton)findViewById(R.id.ib);

    }

    public void click(View view) {
        x=rnd.nextInt(3)+1;
        if (x == 1) {
            iv.setImageResource(R.drawable.cat);
            ib.setImageResource(R.drawable.one);
        } else if (x == 2) {
            iv.setImageResource(R.drawable.dog);
            ib.setImageResource(R.drawable.two);
        }
        else  {
            iv.setImageResource(R.drawable.albert);
            ib.setImageResource(R.drawable.three);
        }
    }

    }


