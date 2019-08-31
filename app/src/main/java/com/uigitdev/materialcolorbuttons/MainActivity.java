package com.uigitdev.materialcolorbuttons;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.materialcolorbuttons.adapter.ItemAdapter;
import com.uigitdev.materialcolorbuttons.model.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> arrayList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        setAdapterType();
        setAdapter();
    }

    @SuppressLint("ResourceType")
    private void initData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Item(R.drawable.ic_bookmark, getString(R.color.colorItem1), getString(R.color.colorItem2)));
        arrayList.add(new Item(R.drawable.ic_toys, getString(R.color.colorItem3), getString(R.color.colorItem4)));
        arrayList.add(new Item(R.drawable.ic_cloud_download, getString(R.color.colorItem5), getString(R.color.colorItem6)));
        arrayList.add(new Item(R.drawable.ic_photo, getString(R.color.colorItem7), getString(R.color.colorItem8)));
        arrayList.add(new Item(R.drawable.ic_favorite, getString(R.color.colorItem9), getString(R.color.colorItem10)));
        arrayList.add(new Item(R.drawable.ic_edit, getString(R.color.colorItem11), getString(R.color.colorItem12)));
    }

    private void setAdapterType() {
        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void setAdapter() {
        ItemAdapter itemAdapter = new ItemAdapter(MainActivity.this, arrayList);
        recyclerView.setAdapter(itemAdapter);
    }
}
