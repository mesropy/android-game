package com.example.ourgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPictureGame(View view) {
        Intent intent = new Intent(this, PictureGame.class);
        startActivity(intent);
    }

    public void playTileGameView(View view) {
        Intent intent = new Intent(this, TileGameInstructions.class);
        startActivity(intent);
    }

    public void playReactionGame(View view) {
        Intent intent = new Intent(this, ReactionTime.class);
        startActivity(intent);
    }
}
