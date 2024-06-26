package com.plurasight;

public abstract class OrderItem {
    private float price;
    private String name;
    public OrderItem(float price, String name){
        this.price = price;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void calcPrice();

    @Override
    public String toString() {
        return "Toppings{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
