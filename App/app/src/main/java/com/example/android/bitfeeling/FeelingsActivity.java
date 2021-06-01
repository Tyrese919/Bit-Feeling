package com.example.android.bitfeeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FeelingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feelings_activity);

        ImageView happyfeeling = (ImageView) findViewById(R.id.happyfeeling);
        ImageView neutralfeeling = (ImageView) findViewById(R.id.neutralfeeling);
        ImageView sadfeeling = (ImageView) findViewById(R.id.sadfeeling);

        happyfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingsActivity.this, ResultAcitivity.class);
                startActivity(intent);
            }
        });

        neutralfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingsActivity.this, ResultAcitivity.class);
                startActivity(intent);
            }
        });

        sadfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingsActivity.this, ResultAcitivity.class);
                startActivity(intent);
            }
        });
    }
}
