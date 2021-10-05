package com.example.social_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.social_media_app.databinding.ActivityEmailBinding;

public class EmailActivity extends AppCompatActivity {

    ActivityEmailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.continueBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(EmailActivity.this, OTPActivity.class);
                intent.putExtra("EmailID", binding.mailBox.getText().toString());
                startActivity(intent);
            }

        });
    }
}