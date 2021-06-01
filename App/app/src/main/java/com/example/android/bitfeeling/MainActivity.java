package com.example.android.bitfeeling;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        Button signinButton = (Button)  findViewById(R.id.signin);
        ImageView questionImage = (ImageView) findViewById(R.id.questionmark);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FeelingsActivity.class);
                startActivity(intent);
            }
        });

        questionImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.questionmark_pressed), Toast.LENGTH_LONG).show();
            }
        });


    }
}
