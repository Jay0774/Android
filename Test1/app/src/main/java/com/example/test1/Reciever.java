package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Reciever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        String name = getIntent().getStringExtra("EXTRA_SESSION_ID");
        TextView t=(TextView)findViewById(R.id.t2);
        t.setText(name);
    }
}