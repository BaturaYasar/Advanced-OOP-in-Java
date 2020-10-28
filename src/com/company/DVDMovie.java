package com.company;

import java.util.List;

public class DVDMovie extends Movie {

    private final int PRICE = 10;
    private final int LOYALTY_POINTS = 5;

    public DVDMovie(String title, int stock) {
        super(title, stock);
    }

    public DVDMovie(String title, String releaseYear, Enum genre, Director director, List<Actor> actors, int stock) {
        super(title, releaseYear, genre, director, actors, stock);
    }

    @Override
    protected int getPrice() {
        return PRICE;
    }

    @Override
    protected int getLoyaltyPoints() {
        return LOYALTY_POINTS;
    }
}
