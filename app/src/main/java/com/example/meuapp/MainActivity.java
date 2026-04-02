package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bntAvancar, bntVoltar;

    ImageView imageView;

    Integer images[] = new Integer[]{
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
        setContentView(R.layout.activity_main);

        bntVoltar=findViewById(R.id.buttonVoltar);
        bntAvancar=findViewById(R.id.buttonAvancar);
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(images[posicao]);

        bntVoltar.setOnClickListener(v -> {
            posicao--;
            if (posicao < 0) {
                posicao = images.length - 1;

            }
            imageView.setImageResource(images[posicao]);
        });

        bntAvancar.setOnClickListener(v -> {
            if ( posicao==images.length-1) {
               posicao = 0;
            } else{
                posicao ++;
            }


            imageView.setImageResource(images[posicao]);
        });

    }
}