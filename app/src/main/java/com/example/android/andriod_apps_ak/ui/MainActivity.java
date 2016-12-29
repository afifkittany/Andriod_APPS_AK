package com.example.android.andriod_apps_ak.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.andriod_apps_ak.R;
import com.example.android.andriod_apps_ak.adapter.DerpAdapter;
import com.example.android.andriod_apps_ak.model.DerpData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private DerpAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recView=(RecyclerView)findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new DerpAdapter(DerpData.getListData(),this);
        recView.setAdapter(adapter);
    }
}
