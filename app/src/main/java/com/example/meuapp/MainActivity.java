package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button bntAvancar, bntVoltar;

    ImageView imageView;

    Integer imagens[] = new Integer[]{
            R.drawable.cachorro,
            R.drawable.gardem,
            R.drawable.happy,
            R.drawable.patinho,
            R.drawable.porquinho

    };
    int posicao=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);


        bntVoltar=findViewById(R.id.buttonAvancar);
        bntAvancar=findViewById(R.id.buttonVoltar);
        imageView=findViewById(R.id.imageView);

        bntAvancar.setOnClickListener(v -> {
            imageView.setImageResource(imagens[posicao]);
        });

    }
}