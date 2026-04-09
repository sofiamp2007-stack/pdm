package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button btnCalcular;

    TextView classificacao;
    TextView resultado;

    EditText etPeso;
    EditText etAltura;


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
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView=findViewById(R.id.imageView);
        etPeso = findViewById(R.id.editTextPeso);
        etAltura = findViewById(R.id.editTextAltura);
        btnCalcular=findViewById(R.id.buttonCalcular);
        resultado = findViewById(R.id.textViewResultado);
        classificacao = findViewById(R.id.textViewClassificacao);

        btnCalcular.setOnClickListener(v -> {
            String pesoStr = etPeso.getText().toString();
            String alturaStr = etAltura.getText().toString();

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            double imc = peso / (altura * altura);

            resultado.setText(Double.toString(imc));

            if (imc < 18.5){
                classificacao.setText("Abaixo do peso");
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

        });

    }

}