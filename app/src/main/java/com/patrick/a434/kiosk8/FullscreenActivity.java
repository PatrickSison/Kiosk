package com.patrick.a434.kiosk8;

import android.annotation.SuppressLint;
import android.icu.text.IDNA;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.content.Intent;


public class FullscreenActivity extends AppCompatActivity {


    private View mContentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);


        mContentView = findViewById(R.id.fullscreen_content);
        final Button mInformation = (Button) findViewById(R.id.information);
      //Listeners
        mInformation.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Informational.class);
                startActivity(intent);
            }
        });
        final Button mPerson = (Button) findViewById(R.id.button_person);
        mPerson.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Person.class);
                startActivity(intent);
            }
        });
        final Button mPlace = (Button) findViewById(R.id.button_place);
        mPlace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Place.class);
                startActivity(intent);
            }
        });
        final Button mWorkspace = (Button) findViewById(R.id.button_workspace);
        mWorkspace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Workspace.class);
                startActivity(intent);
            }
        });
    }



}
