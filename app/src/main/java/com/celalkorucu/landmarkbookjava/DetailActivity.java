package com.celalkorucu.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.celalkorucu.landmarkbookjava.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Landmark seletedLandmark = (Landmark)intent.getSerializableExtra("landmark");

        binding.imageView.setImageResource(seletedLandmark.getImage());
        binding.textView.setText(seletedLandmark.getName());
        binding.textView2.setText(seletedLandmark.getCountry());

    }
}