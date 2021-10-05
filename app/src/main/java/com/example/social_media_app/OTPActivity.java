package com.example.social_media_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.social_media_app.databinding.ActivityOtpactivityBinding;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class OTPActivity extends AppCompatActivity {

    ActivityOtpactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        String EmailID=getIntent().getStringExtra("EmailID");

        binding.emailLabel.setText("Verify "+EmailID);

    }
}