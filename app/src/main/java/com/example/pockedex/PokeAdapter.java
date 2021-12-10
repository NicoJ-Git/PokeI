package com.example.pockedex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pockedex.model.Pokemon;
//(5) creation de la class de l'adapter et de la class interne pour le viewHolder
//(7) importer la class

// (6) creation de la class interne pour le viewHolder (cliclk à droite en passant avec la souris)
// (8)(ampoule ) creation du super contructeur
// (9)en passant avec la souris sur le rouge: implements methods --> le super constructeur va passer sous les methodes

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeViewHolder> {
    @NonNull
    @Override
    public PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //(10) rajouter la phrase magique pour infalter la vue + wrapper (
        return new PokeViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item, parent, false
                ));
    }

    @Override
    public void onBindViewHolder(@NonNull PokeViewHolder holder, int position) {
//(11) binder le viewholder
        holder.bind(getItemId(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class PokeViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iconImageView;
        private final TextView nameTextView;

        public PokeViewHolder(@NonNull View itemView) {
            super(itemView);

            iconImageView =itemView.findViewById(R.id.poke_icon);
            nameTextView =itemView.findViewById(R.id.poke_name);

        }


        public void bind(long itemId) {
            iconImageView.setImageResource((int) itemId);
            nameTextView.setText((int) itemId);
        }
    }
}
