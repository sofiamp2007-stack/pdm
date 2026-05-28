package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    ImageButton buttonsalvar;
    EditText editText;

    ListView lv;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        sqLiteDatabase = openOrCreateDatabase("notas", MODE_PRIVATE, null);

        buttonsalvar = findViewById((R.id.imageButton4));
        editText = findViewById(R.id.editTextText);


        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, nota TEXT)");

        /*nomeColuna valor */

        buttonsalvar.setOnClickListener((v -> {
            ContentValues cv = new ContentValues();
            cv.put("titulo", editText.getText().toString());
            cv.put("nota", editText.getText().toString());
            sqLiteDatabase.insert("notas", null, cv);
            listagem();
        }));

       listagem();
    }

    public void listagem() {
        Cursor c = sqLiteDatabase.rawQuery("SELECT id, id*10,titulo, nota  FROM notas", null);
        c.moveToFirst(); // movimenta a ponteira do cursor para o primeiro registro recuperado
        ArrayList<Nota> listaNotas = new ArrayList<>();
        while (!c.isAfterLast()) {

            @SuppressLint("Range") int id = c.getInt(c.getColumnIndex("id"));
            @SuppressLint("Range") String titulo = c.getString(c.getColumnIndex("titulo"));
            @SuppressLint("Range") String nota = c.getString(c.getColumnIndex("nota"));

            Nota n = new Nota(id, titulo, nota);
            listaNotas.add(n);
            Log.d("SELECT", Integer.toString(id) + ", " + titulo + "," + nota);
            c.moveToNext();

            ArrayList<String> listatitulos = new ArrayList<>();
            for (Nota nota1 : listaNotas) {
                listatitulos.add(nota1.titulo);

            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listatitulos);
            lv.setAdapter(adapter);


        }
    }
}
