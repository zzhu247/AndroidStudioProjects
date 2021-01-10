package com.example.demologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddToWishlist extends AppCompatActivity {
    private Button eAdd;
    private Button eCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_wishlist);

        eAdd = findViewById(R.id.button_save);
        eCancel = findViewById(R.id.button_cancel);

        eAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to next page
                Intent intent = new Intent(AddToWishlist.this, Wishlist.class);
                startActivity(intent);
            }
        });

        eCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to next page
                Intent intent = new Intent(AddToWishlist.this, Wishlist.class);
                startActivity(intent);
            }
        });
    }
}