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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);



        etPeso = findViewById(R.id.editTextPeso);
        etAltura = findViewById(R.id.editText);
        btnCalcular=findViewById(R.id.buttonCalcular);
       // resultado = findViewById(R.id.textViewResultado);
      //  classificacao = findViewById(R.id.textViewClassificacao);

        btnCalcular.setOnClickListener(v -> {
            String pesoStr = etPeso.getText().toString();
            String alturaStr = etAltura.getText().toString();

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            double imc = peso / (altura * altura);

            resultado.setText(Double.toString(imc));



        });

    }

}