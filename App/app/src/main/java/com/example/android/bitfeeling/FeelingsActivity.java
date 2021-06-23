package com.example.android.bitfeeling;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeelingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feelings_activity);

        ImageView veryhappyfeeling = (ImageView) findViewById(R.id.veryhappyfeeling);
        ImageView happyfeeling = (ImageView) findViewById(R.id.happyfeeling);
        ImageView neutralfeeling = (ImageView) findViewById(R.id.neutralfeeling);
        ImageView sadfeeling = (ImageView) findViewById(R.id.sadfeeling);
        ImageView verysadfeeling = (ImageView) findViewById(R.id.verysadfeeling);

        ImageView chat = (ImageView) findViewById(R.id.chat);

        veryhappyfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FeelingsActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                final View customLayout = getLayoutInflater().inflate(R.layout.dialog_screen, null);
                builder.setView(customLayout);
                builder.setCancelable(false);
                builder.setTitle("BitMood");
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_done), Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_cancel), Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = builder.show();
                dialog.show();
            }
        });
        happyfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FeelingsActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                final View customLayout = getLayoutInflater().inflate(R.layout.dialog_screen, null);
                builder.setView(customLayout);
                builder.setCancelable(false);
                builder.setTitle("BitMood");
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_done), Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_cancel), Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = builder.show();
                dialog.show();
            }
        });

        neutralfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FeelingsActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                final View customLayout = getLayoutInflater().inflate(R.layout.dialog_screen, null);
                builder.setView(customLayout);
                builder.setCancelable(false);
                builder.setTitle("BitMood");
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_done), Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_cancel), Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = builder.show();
                dialog.show();
            }
        });

        sadfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FeelingsActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                final View customLayout = getLayoutInflater().inflate(R.layout.dialog_screen, null);
                builder.setView(customLayout);
                builder.setCancelable(false);
                builder.setTitle("BitMood");
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_done), Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_cancel), Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = builder.show();
                dialog.show();
            }
        });

        verysadfeeling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FeelingsActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                final View customLayout = getLayoutInflater().inflate(R.layout.dialog_screen, null);
                builder.setView(customLayout);
                builder.setCancelable(false);
                builder.setTitle("BitMood");
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_done), Toast.LENGTH_LONG).show();
                        finish();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(FeelingsActivity.this, getResources().getString(R.string.dialog_cancel), Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = builder.show();
                dialog.show();
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"2113493@talnet.nl"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Chat with a Student!");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }
            }
        });

    }
}


