package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button button= findViewById(R.id.button);
       final Button button1 = findViewById(R.id.button2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

             if (button1.getBackground().equals(Color.WHITE))

             {
                 button1.setBackgroundColor(Color.RED);
             }
           }
       });
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               button.setBackgroundColor(Color.BLUE);
           }
       });


    }
}
