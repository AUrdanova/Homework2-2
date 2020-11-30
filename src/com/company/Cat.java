package com.company;

public class Cat extends Animal{
    private String color;

    public Cat(String name, String placeOfBirth, String color) {
        super(name, placeOfBirth);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print() {
        super.print();
        System.out.println("color: "+color+" ");
    }
}
