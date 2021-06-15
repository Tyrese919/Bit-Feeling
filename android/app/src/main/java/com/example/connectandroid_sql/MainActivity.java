package com.example.connectandroid_sql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    Connection connect;
    String ConnectionResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetTextFromSQL(View v) {
        TextView tx1 = (TextView) findViewById(R.id.textView);
        TextView tx2 = (TextView) findViewById(R.id.textView2);

        try {
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.Connectionclass();
            if(connect!=null){
            String query= "Select * from students";
            Statement st= connect.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                tx1.setText(rs.getString(1));
                tx2.setText(rs.getString(2));
            }

            }
            else{
               ConnectionResult= "Check Connection";
            }
        }
        catch (Exception ex){

        }

    }
}