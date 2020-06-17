package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private int []images={
            R.drawable.bangladesh, R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.lebanon
    };
    private String[]titles;
    private String[]desc;
    MyAdapter myAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.recyclerViewId);
        titles=getResources().getStringArray(R.array.countryName);
        desc=getResources().getStringArray(R.array.country_desc);
        myAdapter=new MyAdapter(MainActivity.this,images,titles,desc);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}