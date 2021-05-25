package com.example.android.bitfeeling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        TextView studentLoginTextView = (TextView) findViewById(R.id.loginStudent);
        TextView teacherLoginTextView = (TextView) findViewById(R.id.loginTeacher);
        TextView studentRegisterTextView =  (TextView) findViewById(R.id.registerStudent);
        TextView teacherRegisterTextView = (TextView)  findViewById(R.id.registerTeacher);

        studentLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginStudentActivity.class);
                startActivity(intent);
            }
        });

        teacherLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginTeacherActivity.class);
                startActivity(intent);
            }
        });

        studentRegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterStudentActivity.class);
                startActivity(intent);
            }
        });

        teacherRegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterTeacherActivity.class);
                startActivity(intent);
            }
        });
    }
}
