package com.moringaschool.android_ip_1.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.moringaschool.android_ip_1.R;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerViewCategory(); //call the recyclerView on create.

    }

    private void recyclerViewCategory() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewItemsList = findViewById(R.id.recyclerView);
        recyclerViewItemsList.setLayoutManager(linearLayoutManager);

//        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
//        categoryList.add(new CategoryDomain("Pizza", "cat_1"));
//        categoryList.add(new CategoryDomain("Burger", "cat_2"));
//        categoryList.add(new CategoryDomain("Hotdog", "cat_3"));
//        categoryList.add(new CategoryDomain("Drink", "cat_4"));
//        categoryList.add(new CategoryDomain("Doughnut", "cat_5"));
//
//        adapter = new CategoryAdapter(categoryList);
//        recyclerViewItemsList.setAdapter(adapter);

    }
}