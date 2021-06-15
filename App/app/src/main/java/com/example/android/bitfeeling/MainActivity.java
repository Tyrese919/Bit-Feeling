package com.example.android.bitfeeling;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        ImageView questionImage = (ImageView) findViewById(R.id.questionmark);

        questionImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(R.string.questionmark_pressed), Toast.LENGTH_LONG).show();
            }
        });

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent notificationIntent = new Intent(this, NotificationClass.class);
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(System.currentTimeMillis());
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 47);
        cal.set(Calendar.SECOND, 0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),AlarmManager.INTERVAL_DAY,broadcast);

    }

    public void login(View view) {
        EditText logincode  = (EditText) findViewById(R.id.logincode);
        EditText loginpassword  = (EditText) findViewById(R.id.loginpassword);

        if (logincode.getText().toString().isEmpty() || loginpassword.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, getResources().getString(R.string.empty_login_view), Toast.LENGTH_SHORT).show();
        } else {
            if (logincode.getText().toString().equals("1") && loginpassword.getText().toString().equals("2")) {
                Intent intent = new Intent(MainActivity.this, FeelingsActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, getResources().getString(R.string.login_succes), Toast.LENGTH_SHORT).show();
                logincode.setText("");
                loginpassword.setText("");
            } else {
                logincode.setText("");
                loginpassword.setText("");
                Toast.makeText(MainActivity.this, getResources().getString(R.string.login_fail), Toast.LENGTH_SHORT).show();
            }
        }
    }
}

