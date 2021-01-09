package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisrationActivity extends AppCompatActivity {
    private EditText registerName;
    private  EditText registerPassword;
    private EditText setGoal;
    private Button registerBtn;

    public static Credentials credentials;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisration);

        registerName = findViewById(R.id.SetName);
        registerPassword = findViewById(R.id.SetPassword);
        setGoal = findViewById(R.id.setGoal);
        registerBtn = findViewById(R.id.registerBtn);



        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a lost to store user info
                String regName = registerName.getText().toString();
                String regPassword = registerPassword.getText().toString();
                //add user goal into our account list
                String regGoal = setGoal.getText().toString();

                if (validate(regName, regPassword, regGoal)) {
                    credentials = new Credentials(regName, regPassword);
                    Intent intent = new Intent(RegisrationActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(RegisrationActivity.this, "Regisration Successful!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(RegisrationActivity.this, "We can now plant trees together!", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
    private boolean validate(String userName, String userPassword, String userGoal){
        if(userName.isEmpty() || userPassword.isEmpty() || userGoal.isEmpty()){
            Toast.makeText(RegisrationActivity.this, "Please Enter All the Information!", Toast.LENGTH_SHORT).show();
            return false;
        } else if (userPassword.length() < 8){
            Toast.makeText(RegisrationActivity.this, "Your password should be at least 8 characters.", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}