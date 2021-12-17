package com.example.pockedex.repository;

import com.example.pockedex.R;
import com.example.pockedex.model.Pokemon;
import com.example.pockedex.model.PokemonType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonRepository {

    private static final List<Pokemon> pokemons= Arrays.asList(new Pokemon(1, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));

 // public PokemonRepository() {


 //     //(nino1)creation de la liste de pokemons

 //     pokemons = new ArrayList<Pokemon>();
 //     pokemons.add(new Pokemon(1, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));
 //     pokemons.add(new Pokemon(2, R.drawable.ic_baseline_local_fire_department_24, "Charizard", "Charizard", PokemonType.FIRE));
 //     pokemons.add(new Pokemon(3, R.drawable.ic_baseline_waves_24, "Blastoise", "Blastoise", PokemonType.WATER));
 //     pokemons.add(new Pokemon(4, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));
 //     pokemons.add(new Pokemon(5, R.drawable.ic_baseline_local_fire_department_24, "Charizard", "Charizard", PokemonType.FIRE));
 //     pokemons.add(new Pokemon(6, R.drawable.ic_baseline_waves_24, "Blastoise", "Blastoise", PokemonType.WATER));
 //     pokemons.add(new Pokemon(7, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));
 //     pokemons.add(new Pokemon(8, R.drawable.ic_baseline_local_fire_department_24, "Charizard", "Charizard", PokemonType.FIRE));
 //     pokemons.add(new Pokemon(9, R.drawable.ic_baseline_waves_24, "Blastoise", "Blastoise", PokemonType.WATER));
 //     pokemons.add(new Pokemon(10, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));
 //     pokemons.add(new Pokemon(11, R.drawable.ic_baseline_local_fire_department_24, "Charizard", "Charizard", PokemonType.FIRE));
 //     pokemons.add(new Pokemon(12, R.drawable.ic_baseline_waves_24, "Blastoise", "Blastoise", PokemonType.WATER));
 //     pokemons.add(new Pokemon(13, R.drawable.ic_baseline_terrain_24, "Bulbizarre", "Bulbasaure", PokemonType.GRASS));
 //     pokemons.add(new Pokemon(14, R.drawable.ic_baseline_local_fire_department_24, "Charizard", "Charizard", PokemonType.FIRE));
 //     pokemons.add(new Pokemon(15, R.drawable.ic_baseline_waves_24, "Blastoise", "Blastoise", PokemonType.WATER));


 // }

    public static List<Pokemon> getPokemons() {
        return pokemons;
    }

}
