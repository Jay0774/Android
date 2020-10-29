package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class friend extends AppCompatActivity {

    EditText e1,e2;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        String s;
        e1=(EditText)findViewById(R.id.ed1);
        i=(ImageView)findViewById(R.id.i1);
        e2=(EditText)findViewById(R.id.ed2);
        e1.setText(str);
        if(str.compareTo("Amit")==0)
        {
            i.setImageResource(R.drawable.amit);
            s="or kaisa hai...";
            e2.setText(s);
        }
        else if(str.compareTo("Mohit")==0)
        {
            i.setImageResource(R.drawable.mohit);
            s="or bhai...";
            e2.setText(s);
        }
        else if(str.compareTo("Manas")==0)
        {
            i.setImageResource(R.drawable.manas);
            s="hai hai...";
            e2.setText(s);
        }
        else if(str.compareTo("Mudit")==0)
        {
            i.setImageResource(R.drawable.mudit);
            s="jai...";
            e2.setText(s);
        }
        else if(str.compareTo("Ravi")==0)
        {
            i.setImageResource(R.drawable.ravi);
            s="chai...";
            e2.setText(s);
        }
    }
}