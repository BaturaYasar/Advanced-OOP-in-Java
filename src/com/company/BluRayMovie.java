package com.company;

import java.util.List;

public class BluRayMovie extends Movie {

    private final int PRICE = 20;
    private final int LOYALTY_POINTS = 10;

    public BluRayMovie(String title, int stock) {
        super(title, stock);
    }

    public BluRayMovie(String title, String releaseYear, Enum genre, Director director, List<Actor> actors, int stock) {
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
