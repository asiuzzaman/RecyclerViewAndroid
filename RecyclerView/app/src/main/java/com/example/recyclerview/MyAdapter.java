package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private Context context;
    private int[] images;
    private String[] countryName,countryDesc;

    public MyAdapter(Context context, int[] images, String[] countryName, String[] countryDesc) {
        this.context = context;
        this.images = images;
        this.countryName = countryName;
        this.countryDesc = countryDesc;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.sample_layout,parent,false);
        MyViewHolder temp=new MyViewHolder(view);
        return temp;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(countryName[position]);
        holder.description.setText(countryDesc[position]);
        holder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return countryName.length;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title,description;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title_id);
            description=itemView.findViewById(R.id.description_id);
            imageView=itemView.findViewById(R.id.image_view_flag);
        }
    }
}
