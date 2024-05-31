package com.plurasight;

public class Drink  {
    private String flavor;
    private String size;
    private float price;

    public Drink(String flavor, String size, float price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "flavor='" + flavor + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
