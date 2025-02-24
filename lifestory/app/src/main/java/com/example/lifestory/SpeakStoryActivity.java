package com.example.lifestory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SpeakStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speak_story);

        Button backToHomeButton = findViewById(R.id.backToHomeBtn);
        backToHomeButton.setOnClickListener(v -> {
            Intent intent = new Intent(SpeakStoryActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
