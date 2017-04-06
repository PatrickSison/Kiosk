package com.patrick.a434.kiosk8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Place extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_place);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button mButton1 = (Button) findViewById(R.id.button_1);
        //Listeners
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.ground_floor_0);
            }
        });
        final Button mButton2 = (Button) findViewById(R.id.button_2);
        //Listeners
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.floor_one_0);
            }
        });
        final Button mButton3 = (Button) findViewById(R.id.button_3);
        //Listeners
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.upper_floor_0);
            }
        });

        final Button mButton4 = (Button) findViewById(R.id.button_4);
        //Listeners
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.picture);
                imageView.setImageResource(R.drawable.room_highlighted);
            }
        });
    }

}
