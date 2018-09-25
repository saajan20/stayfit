package com.example.saajan.stayfit_2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder>{
    private static final String TAG = "AdapterClass";
    private ArrayList<Integer> Images=new ArrayList<>();
    private ArrayList<String> ename=new ArrayList<>();
    private Context mContext;

    public AdapterClass(ArrayList<Integer> images, Context mContext,ArrayList<String> Ename) {
        ename=Ename;
        Images = images;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap().load(Images.get(position)).into(holder.image);
        holder.exercisename.setText(ename.get(position));
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                Intent i=new Intent(mContext,chest.class);
mContext.startActivity(i);
            }
            else {
                    Intent i=new Intent(mContext,back.class);
                    mContext.startActivity(i);
                }
            }

        });




    }

    @Override
    public int getItemCount() {
        return Images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView exercisename;
        RelativeLayout layout;
        public ViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            layout=itemView.findViewById(R.id.R_layout);
            exercisename=itemView.findViewById(R.id.exercisename);

        }
    }
}
