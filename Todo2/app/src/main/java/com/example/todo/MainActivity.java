package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.email);
    }
    boolean validateEmail() {
        String emailInput = editText.getText().toString().trim();
        if (emailInput.isEmpty()) {
            editText.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            editText.setError("Please enter a valid email address");
            return false;
        } else {
            editText.setError(null);
            return true;
        }
    }

    public void emailvalid(View view) {
        if(validateEmail())
        {
            Intent intent = new Intent(this,Next.class);
            startActivity(intent);
            finish();
        }
        return;

    }
}