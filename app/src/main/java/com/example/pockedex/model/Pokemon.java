package com.example.pockedex.model;

import androidx.annotation.DrawableRes;

public class Pokemon {

    //quest ce que l'on affiche et quest ce que l'on manipule

    private long itemId;

    @DrawableRes
    private int iconDrawableRes;

    private String name;

    private String englishName;

    private PokemonType pokemonType;

    public Pokemon(long itemId, int iconDrawableRes, String name, String englishName, PokemonType pokemonType) {
        this.itemId = itemId;
        this.iconDrawableRes = iconDrawableRes;
        this.name = name;
        this.englishName = englishName;
        this.pokemonType = pokemonType;
    }

    public int getId() {
        return (int) itemId;
    }

    public void setId(int id) {
        this.itemId = id;
    }

    public int getIconDrawableRes() {
        return iconDrawableRes;
    }

    public void setIconDrawableRes(int iconDrawableRes) {
        this.iconDrawableRes = iconDrawableRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }
}
