package com.aulaudemy.mortyflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButtonPlay = findViewById(R.id.imageButtonPlay);

        imageButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFullScreenVideo();
            }
        });
    }

    public void openFullScreenVideo() {
        Intent intent = new Intent( this, FullscreenActivity.class);
        startActivity(intent);
    }
}