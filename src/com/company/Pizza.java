package com.company;

public class Pizza implements IPizza{
    @Override
    public String PizzaIngredient() {
        return "Bund";
    }

    @Override
    public int Pris() {
        return 10;
    }
}
