package com.example.counterbutton;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.counterbutton.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        updateCounter();
        binding.btnClick.setOnClickListener(view -> updateCounter());

    }

    private void updateCounter(){
        binding.tvCounter.setText(counter++);
    }
}