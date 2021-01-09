package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;

    private String defaultUserName = "Admin";
    private String defaultPassword = "12345678";
    private boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.eName);
        ePassword = findViewById(R.id.editTextTextPassword);
        eLogin = findViewById(R.id.buttonLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();


                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter All the Information!", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = ValidateLogin(inputName,inputPassword);
                    if(!isValid){
                        Toast.makeText(MainActivity.this, "Incorrect User Name or Password!", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "Successful! YOU ARE IN", Toast.LENGTH_SHORT).show();

                        // Go to main page
                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });
    }

    private boolean ValidateLogin(String name, String password){
        if (name.equals(defaultUserName) && password.equals(defaultPassword)){
            return true;
        }
        return false;
    }
}