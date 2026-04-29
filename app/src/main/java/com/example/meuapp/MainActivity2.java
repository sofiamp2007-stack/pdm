package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapp.R;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;

    TextView resultado;
    TextView classificacao;

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

        resultado= findViewById(R.id.textViewResultado);
        classificacao= findViewById(R.id.textViewClassificacao);
        Intent i= getIntent();
        Bundle btnCalcular= i.getExtras();
        double imc = btnCalcular.getDouble("resultado");

        resultado.setText(String.valueOf(imc));

        if (imc < 18.5){

            imageView.setImageResource(R.drawable.abaixopeso);
        } else if ((imc > 18.5) && (imc< 24.9)){
            classificacao.setText("Peso  normal");
            imageView.setImageResource(  R.drawable.normal);

        }else if ((imc > 25) && (imc< 29.9)) {
            classificacao.setText("Sobrepeso");
            imageView.setImageResource(R.drawable.sobrepeso);
        } else if ((imc > 30) && (imc< 34.9)) {
            classificacao.setText("Obesidade 1 ");
            imageView.setImageResource(R.drawable.obesidade1);
        } else if ((imc > 35) && (imc< 39.9)) {
            classificacao.setText("Obesidade 2");
            imageView.setImageResource(R.drawable.obesidade2);
        } else  {
            classificacao.setText("Obesidade 3");
            imageView.setImageResource(R.drawable.obesidade3);
        }
    }
}