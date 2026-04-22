package com.example.meuapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;



    Integer images[] = new Integer[]{
            R.drawable.normal,
            R.drawable.perfil,
            R.drawable.abaixopeso,
            R.drawable.sobrepeso,
            R.drawable.obesidade1,
            R.drawable.obesidade2,
            R.drawable.obesidade3

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);


        imageView=findViewById(R.id.imageView2);

    }
}