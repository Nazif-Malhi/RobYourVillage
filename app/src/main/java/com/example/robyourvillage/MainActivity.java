package com.example.robyourvillage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* Main Activity Entry Point of our Application */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Full Screen
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hiding Navigation Bar
        View overlay = findViewById(R.id.myGame_Layout);
        overlay.setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                     | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        // set content view to game, so that objects in the game class can be rendered to the screen

        setContentView(new Game(this));
    }
}