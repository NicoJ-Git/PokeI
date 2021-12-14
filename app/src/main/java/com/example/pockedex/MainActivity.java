package com.example.pockedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pockedex.model.Pokemon;
import com.example.pockedex.model.PokemonType;
import com.example.pockedex.repository.PokemonRepository;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private final PokemonRepository mPokemonRepository = new PokemonRepository();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //(4)creation de l'instance d'adapteur, et on passe le parametre dans le recyclerview (dans 3)
        // et je creai la class PokeAdapter
        PokeAdapter adapter = new PokeAdapter();

        //(1)on recupère l'instance de recyclerview
        RecyclerView recyclerView = findViewById(R.id.poke_recycler);
        // (2)on donne un layoutmanager au recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //(3)on donne l'adapteur
        recyclerView.setAdapter(adapter);

        
        adapter.getItemId(mPokemonRepository.getPokemons());
    }

}