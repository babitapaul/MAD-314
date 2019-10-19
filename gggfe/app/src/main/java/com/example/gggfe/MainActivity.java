package com.example.gggfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button button;
    // database
    String goodusername = "Good";
    String goodpassword ="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable usernameeditable = username.getText();
                String username = usernameeditable.toString();

                Editable passwordeditable = password.getText();
                String password = passwordeditable.toString();

                if (username.equals(goodusername) && password.equals(goodpassword))
                {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                   intent.putExtra("username", username);

                    startActivity(intent);

                }



            }
        });
    }
}
