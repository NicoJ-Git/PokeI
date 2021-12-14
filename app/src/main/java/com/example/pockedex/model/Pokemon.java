package com.example.pockedex.model;

import androidx.annotation.DrawableRes;

public class Pokemon {

    //quest ce que l'on affiche et quest ce que l'on manipule

    private final long itemId;

    @DrawableRes
    private  final int iconDrawableRes;

    private final String name;

    private final String englishName;

    private final PokemonType pokemonType;

    //constructeur

    public Pokemon(long itemId, int iconDrawableRes, String name, String englishName, PokemonType pokemonType) {
        this.itemId = itemId;
        this.iconDrawableRes = iconDrawableRes;
        this.name = name;
        this.englishName = englishName;
        this.pokemonType = pokemonType;

    }

    //getter (immutabilité: pas de setter pour avoir des variable en final pour eviter le code spagetti)


    public int getId() {
        return (int) itemId;
    }



    public int getIconDrawableRes() {
        return iconDrawableRes;
    }



    public String getName() {
        return name;
    }



    public String getEnglishName() {
        return englishName;
    }



    public PokemonType getPokemonType() {
        return pokemonType;
    }


}
