package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.R;


public class MainActivity extends AppCompatActivity {

    Button btnCalcular;

    EditText etPeso;
    EditText etAltura;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdgeToEdge.enable(this);
        getString(R.string.app_name);



        etPeso = findViewById(R.id.editTextPeso);
        etAltura = findViewById(R.id.editText);
        btnCalcular=findViewById(R.id.buttonCalcular);


        btnCalcular.setOnClickListener(v -> {

            String pesoStr = etPeso.getText().toString();
            String alturaStr = etAltura.getText().toString();

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            double imc = peso / (altura * altura);


            Intent i = new Intent(getApplicationContext(), MainActivity2.class);

            i.putExtra("resultado", imc);
            startActivity(i);





        });

    }

}