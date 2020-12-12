package com.example.multithreading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_query;
    TextView textView;
    TextView text1;
    boolean twice = false;
    Thread t = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_query = findViewById(R.id.edit_query);
        textView = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runthread();
                runthread1();
            }
        });
    }
    private void runthread1() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                text1.setText("DEMO OF MULTITHREADING");
            }
        });
    }

    private void runthread() {
        twice = true;
        if (twice) {
            final String s1 = edit_query.getText().toString();
            t = new Thread(new Runnable() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(t.getName());
                            twice = false;
                        }
                    });
                }
            });
            t.start();
            t.setName(s1);
            t.setPriority(Thread.MAX_PRIORITY);
        }
    }
}