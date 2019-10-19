package com.example.gggfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView usernameview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        usernameview = findViewById(R.id.textView);

        Intent intent = getIntent();
        String username =intent.getStringExtra("username");

        usernameview.setText("welcome "  +  username);

    }
}
