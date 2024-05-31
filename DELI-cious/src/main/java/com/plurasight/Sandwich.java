package com.plurasight;

import java.util.ArrayList;
import java.util.Arrays;

public class Sandwich extends OrderItem {
    private String size;

    private String[] meat;
    private String[] bread;
    private String[] cheese;
    private String[] regularToppings;
    private String[] sauces;
    private String[] sides;
    private boolean extraMeat;
    private boolean extraCheese;
    private boolean toasted;

    private ArrayList<Float> price = new ArrayList<>();


    // Constructor with all parameters
    public Sandwich(String size, String[] bread, String[] meat, String[] cheese, String[] regularToppings, String[] sauces, String[] sides, float price) {
        super(price, "Sandwich");
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.sides = sides;
        this.price = new ArrayList<>();
    }

    // Default constructor
    public Sandwich() {
        super(0, "Sandwich");
        this.size = "0";
        this.bread = new String[]{"white", "wheat", "rye", "wrap"};
        this.meat = new String[]{"steak", "ham", "salami", "roast beef", "chicken", "bacon"};
        this.cheese = new String[]{"american", "provolone", "cheddar", "swiss"};
        this.regularToppings = new String[]{"lettuce", "peppers", "onions", "tomatoes", "jalapenos", "cucumbers", "pickles", "guacamole", "mushrooms"};
        this.sauces = new String[]{"mayo", "mustard", "ketchup", "ranch", "thousand islands", "vinaigrette"};
        this.sides = new String[]{"au jus", "sauce"};
    }

    public Sandwich(float fourInchPrice) {
        super(fourInchPrice, "sandwich");
    }

    public Sandwich(String[] size, String[] breadType, String[] meatType, String[] cheeseType, String[] regularToppings, String[] sauces, String[] sides) {
        super(0, "Sandwich");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getBreadType() {
        return bread;
    }

    public void setBreadType(String[] breadType) {
        this.bread = breadType;
    }

    public String[] getMeatType() {
        return meat;
    }

    public void setMeat(String[] meatType) {
        this.meat = meat;
    }

    public String[] getCheese() {
        return cheese;
    }

    public void setCheese(String[] cheeseType) {
        this.cheese = cheese;
    }

    public String[] getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(String[] regularToppings) {
        this.regularToppings = regularToppings;
    }

    public String[] getSauces() {
        return sauces;
    }

    public void setSauces(String[] sauces) {
        this.sauces = sauces;
    }

    public String[] getSides() {
        return sides;
    }

    public void setSides(String[] sides) {
        this.sides = sides;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    @Override
    public void calcPrice() {
        // Add logic here to calculate the price of the sandwich
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size='" + size + '\'' +
                ", breadType=" + Arrays.toString(bread) +
                ", meatType=" + Arrays.toString(meat) +
                ", cheeseType=" + Arrays.toString(cheese) +
                ", regularToppings=" + Arrays.toString(regularToppings) +
                ", sauces=" + Arrays.toString(sauces) +
                ", sides=" + Arrays.toString(sides) +
                ", extraMeat=" + extraMeat +
                ", extraCheese=" + extraCheese +
                ", toasted=" + toasted +
                ", price=" + price +
                '}';
    }
}
