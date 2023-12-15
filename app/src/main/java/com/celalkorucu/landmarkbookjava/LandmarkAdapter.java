package com.celalkorucu.landmarkbookjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.celalkorucu.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter  extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {


    ArrayList<Landmark> landmarkList;

    public LandmarkAdapter(ArrayList<Landmark> landmarkList) {
        this.landmarkList = landmarkList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return  new LandmarkHolder(recyclerRowBinding);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(LandmarkAdapter.LandmarkHolder holder, int position) {

        holder.binding.textView.setText(landmarkList.get(position).getName());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext() , DetailActivity.class);
                intent.putExtra("landmark",landmarkList.get(position));

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return landmarkList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{

      private RecyclerRowBinding binding ;

        public LandmarkHolder(@NonNull RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
