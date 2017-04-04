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
import android.widget.Button;
import android.content.Intent;
/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;

    private View mContentView;
    private View mControlsView;
    private boolean mVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        mVisible = true;
        mContentView = findViewById(R.id.fullscreen_content);
        final Button mInformation = (Button) findViewById(R.id.information);
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
                Intent intent = new Intent(FullscreenActivity.this, Informational.class);
                startActivity(intent);
            }
        });
        final Button mPlace = (Button) findViewById(R.id.button_place);
        mPlace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Informational.class);
                startActivity(intent);
            }
        });
        final Button mWorkspace = (Button) findViewById(R.id.button_workspace);
        mWorkspace.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, Informational.class);
                startActivity(intent);
            }
        });
    }



}
