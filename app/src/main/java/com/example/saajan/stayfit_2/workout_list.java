package com.example.saajan.stayfit_2;

import android.support.v7.app.AppCompatActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class workout_list extends AppCompatActivity {
    private ArrayList<Integer> name=new ArrayList<>();
    private ArrayList<String> ename=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout);
        init();
    }
    private void init(){
        name.add(R.drawable.chest);ename.add("Chest");
        name.add(R.drawable.back);ename.add("Back");
        name.add(R.drawable.bicep);ename.add("Bicep");
        name.add(R.drawable.leg);ename.add("Leg");
        name.add(R.drawable.shoulder);ename.add("Shoulder");
        name.add(R.drawable.tricep);ename.add("Tricep");
        recycle();
    }
    private void recycle(){
        RecyclerView recyclerView=findViewById(R.id.recycle);
        AdapterClass a=new AdapterClass(name,this,ename);
        recyclerView.setAdapter(a);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

