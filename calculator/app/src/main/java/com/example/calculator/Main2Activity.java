package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = findViewById(R.id.textView);
        TextView text1 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button2);
        Intent intent = getIntent();
        int x = Integer.parseInt(intent.getStringExtra("num1"));
        int y = Integer.parseInt(intent.getStringExtra("num2"));
        int z = Integer.parseInt(intent.getStringExtra("num3"));

        text.setText("Sum " +(x+y+z));
        text1.setText("product "+(x*y*z));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent1);
            }
        });


    }
}
