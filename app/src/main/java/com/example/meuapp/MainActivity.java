package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView tv;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        b = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        b.setOnClickListener(v -> {
            contador++;
            tv.setText(Integer.toString(contador));
        });
    }
}