package com.example.android.bitfeeling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeelingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feelings_activity);

        ImageView happyfeeling = (ImageView) findViewById(R.id.happyfeeling);
        ImageView neutralfeeling = (ImageView) findViewById(R.id.neutralfeeling);
        ImageView sadfeeling = (ImageView) findViewById(R.id.sadfeeling);
        ImageView chat = (ImageView) findViewById(R.id.chat);

        happyfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.chatbutton_pressed), Toast.LENGTH_LONG).show();
            }
        });

        neutralfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.chatbutton_pressed), Toast.LENGTH_LONG).show();
            }
        });

        sadfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.chatbutton_pressed), Toast.LENGTH_LONG).show();
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "2113493@talnet.nl" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Question from a Student!");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }
              }
        });
    }
}
