package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText text1;
    EditText text2;
    EditText text3;
    String x, y, z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         text1 = findViewById(R.id.editText);
         text2 = findViewById(R.id.editText2);
         text3 = findViewById(R.id.editText3);
         button =findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                  x = (text1.getText().toString());
                  y = (text2.getText().toString());
                 z = (text3.getText().toString());
                 if (text1.length() == 0 || text2.length() == 0 || text3.length() == 0) {
                     Toast.makeText(MainActivity.this, "Number", Toast.LENGTH_LONG).show();
                 }
                 else
                 {
                     Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                     intent.putExtra("num1", x);
                     intent.putExtra("num2", y);
                     intent.putExtra("num3", z);

                     startActivity(intent);
                 }
             }
         });

    }
}
