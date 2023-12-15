package com.celalkorucu.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.celalkorucu.landmarkbookjava.databinding.ActivityDetailBinding;
import com.celalkorucu.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding ;
    ArrayList<Landmark> landmarkList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setContentView(view);



        Landmark ayasofya = new Landmark("Ayasofya","Türkiye",R.drawable.ayasofya);
        Landmark eiffel = new Landmark("Eiffel" , "France",R.drawable.eiffel);
        Landmark galata = new Landmark("Galata","Türkiye",R.drawable.galata);
        Landmark londonbridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);

        landmarkList = new ArrayList<>();
        landmarkList.add(ayasofya);
        landmarkList.add(eiffel);
        landmarkList.add(galata) ;
        landmarkList.add(londonbridge);



 /*
        ArrayAdapter arrayAdapter = new ArrayAdapter(this , android.R.layout.simple_list_item_1 ,
                landmarkList.stream().map(landmark -> landmark.getName()).collect(Collectors.toList()));


        binding.listView.setAdapter(arrayAdapter);


        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,landmarkList.get(i).getName() , Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                intent.putExtra("landmark" , landmarkList.get(i));

                startActivity(intent);
            }
        });
        */

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}