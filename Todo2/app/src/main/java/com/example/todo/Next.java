package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Next extends AppCompatActivity {
    adapter myHomeAdapter;
    private List<Data> myHomeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myHomeData = new ArrayList<Data>();
        myHomeData.add(new Data("Ecell"));
        myHomeData.add(new Data("Online Webinar"));
        myHomeData.add(new Data("Something About ML"));
        myHomeData.add(new Data("Programming..."));
        myHomeData.add(new Data("PrePlacement Talk"));
        myHomeAdapter = new adapter(myHomeData,this);
        recyclerView.setAdapter(myHomeAdapter);
    }
    public void addNew(View view) {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String add = editText.getText().toString();
        myHomeData.add(new Data(add));
    }
}