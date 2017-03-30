package com.heqinuc.uitest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by heqin on 17/3/30.
 */

public class RecyAdapter extends RecyclerView.Adapter <RecyAdapter.ViewHolder> {
    private List<Fruit> myRecys;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView recyImage;
        TextView recyName;
        View fruitView;
        public ViewHolder(View view) {
            super(view);
            fruitView = view;
            recyImage = (ImageView) view.findViewById(R.id.fruit_image);
            recyName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }
    public RecyAdapter(List<Fruit> recys) {
        myRecys = recys;
    }

    @Override
    public RecyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stagger_grid_layout,parent,false);
        final RecyAdapter.ViewHolder holder = new RecyAdapter.ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
                Fruit fruit = myRecys.get(postion);
                Toast.makeText(v.getContext(),"you clicked view" + fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.recyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postion = holder.getAdapterPosition();
                Fruit fruit = myRecys.get(postion);
                Toast.makeText(v.getContext(),"you clicked imageView" + fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyAdapter.ViewHolder holder, int position) {
        Fruit fruit = myRecys.get(position);
        holder.recyName.setText(fruit.getName());
        holder.recyImage.setImageResource(fruit.getImageId());
    }

    @Override
    public int getItemCount() {
        return myRecys.size();
    }

}
