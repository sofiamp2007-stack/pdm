package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterPlaneta extends ArrayAdapter<Planeta> {
    Context lcontext;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull List objects){
        super(context, resource, objects);
        lcontext=context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        //inflar layout xml
        LayoutInflater inflater = LayoutInflater.from(lcontext);
        View itemView = inflater.inflate(R.layout.criandolayout,parent, false);

        TextView tvNone = itemView.findViewById(R.id.textView);
        ImageView imageView = itemView.findViewById(R.id.imageView);
        TextView massa = itemView.findViewById((R.id.textView2));

        Planeta p = getItem(position);
        tvNone.setText(p.nome);
        imageView.setImageResource(p.foto);
        massa.setText(p.peso);



        return itemView;

    }

}
