package com.example.chassis_bus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    Button pembelian;
    RecyclerView rvData;
    private ArrayList<Chassis> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvData = findViewById(R.id.id_kemeja);
        rvData.setHasFixedSize(true);

        list.addAll(DataChassis.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListChassisAdapter listChassisAdapter = new ListChassisAdapter(list) {
        };
        rvData.setAdapter(listChassisAdapter);
    }
}
