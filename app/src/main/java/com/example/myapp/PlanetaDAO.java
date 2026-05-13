package com.example.myapp;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> listaPlanetas;
    public PlanetaDAO(){
        listaPlanetas=new ArrayList<>();
        listaPlanetas.add(new Planeta ("Mercurio", R.drawable.mercury, "3.30*10^23"));
        listaPlanetas.add(new Planeta ("Venus", R.drawable.venus,"4.867*10^24"));
        listaPlanetas.add(new Planeta ("Terra", R.drawable.earth,"5,972*10^24"));
        listaPlanetas.add(new Planeta ("Marte", R.drawable.mars,"6.42*10^23"));
        listaPlanetas.add(new Planeta ("Jupiter", R.drawable.jupter,"1.898*10^27"));
        listaPlanetas.add(new Planeta ("Saturno", R.drawable.saturn,"5.683*10^26"));
        listaPlanetas.add(new Planeta ("Urano", R.drawable.uranus,"8.681*10^25"));
        listaPlanetas.add(new Planeta ("Netuno", R.drawable.neptune,"1.024*10^26"));
    }

    public ArrayList<Planeta> listaPlanetas() {
        return listaPlanetas;
    }
}
