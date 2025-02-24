package com.example.lifestory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PublicZoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_zone);

        Button backToHomeButton = findViewById(R.id.backToHomeBtn);
        backToHomeButton.setOnClickListener(v -> {
            Intent intent = new Intent(PublicZoneActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
