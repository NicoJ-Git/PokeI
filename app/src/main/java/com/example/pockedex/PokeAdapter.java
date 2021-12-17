package com.example.pockedex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.pockedex.model.Pokemon;

import java.util.ArrayList;
import java.util.List;
//(5) creation de la class de l'adapter et de la class interne pour le viewHolder
//(7) importer la class

// (6) creation de la class interne pour le viewHolder (cliclk à droite en passant avec la souris)
// (8)(ampoule ) creation du super contructeur
// (9)en passant avec la souris sur le rouge: implements methods --> le super constructeur va passer sous les methodes


public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeViewHolder> {

    private final List<Pokemon> pokemons = new ArrayList<>();

    @NonNull
    @Override
    public PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //(10) rajouter la phrase magique pour infalter la vue + wrapper
        //(NinoB) il cree autant de nouvelle lignes qu'il a beeoin) (ici: 1 pokemon = 1 ligne)
        return new PokeViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PokeViewHolder holder, int position) {
        //(11) binder le viewholder
        // (Nino C) il fout un coup de peinture à chaque ligne avec le bon pokemon
        holder.bind(pokemons.get(position));
    }

    // (Nino D) overrider getItemCount() pour dire combien de lignes doivent être affichées
    // l'adapter se demande combien d'item il faut afficher
    @Override
    public int getItemCount() {

        return pokemons.size();
    }

    // (Nino E) on met à jour la liste interne de l'adapter (qui représente les pokémons à afficher) avec les bonnes données
    public void displayPokemons(List<Pokemon> pokemons) {
       this.pokemons.clear();
        this.pokemons.addAll(pokemons);
        // (Nino F) on dit à l'adapter de se mettre à jour visuellement
        this.notifyDataSetChanged();
    }



    public class PokeViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iconImageView;
        private final TextView nameTextView;


        public PokeViewHolder(@NonNull View itemView) {
            super(itemView);

            iconImageView = itemView.findViewById(R.id.poke_icon);
            nameTextView = itemView.findViewById(R.id.poke_name);

        }

        public void bind(Pokemon pokemon) {

// (Nino G) la ligne se met à jour ici (le coup de peinture c'est vraiment ici que ça se passe)
            iconImageView.setImageResource(pokemon.getIconDrawableRes());
            nameTextView.setText(pokemon.getName());
        }
    }
}
