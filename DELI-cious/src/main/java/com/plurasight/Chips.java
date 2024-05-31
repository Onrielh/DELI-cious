package com.plurasight;

public class Chips {
    private float  price;
    private float type;

    public Chips(float price, float type) {
        this.price = price;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getType() {
        return type;
    }

    public void setType(float type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "price=" + price +
                ", type=" + type +
                '}';
    }
}
