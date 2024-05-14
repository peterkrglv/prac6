package com.example.prac6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.prac6.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {


    ActivityNextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityNextBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding.bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                binding.textView.setText("Home");
            } else if (item.getItemId() == R.id.notification) {
                binding.textView.setText("Notifications");
            } else if (item.getItemId() == R.id.settings) {
                binding.textView.setText("Settings");
            }
            return true;
        });
        setContentView(binding.getRoot());
    }
}