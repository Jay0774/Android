package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.t1);
        final Button button1 = (Button) findViewById(R.id.b1);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] names = getResources().getStringArray(R.array.name);
                Random rand = new Random();
                int  n = rand.nextInt(names.length-1);
                textView.setText(names[n]);
                Intent intent = new Intent(getBaseContext(), Reciever.class);
                intent.putExtra("EXTRA_SESSION_ID", names[n]);
                startActivity(intent);
            }
        });

    }
}