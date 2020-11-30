package com.company;

public class Unicorn extends Animal{
    private String favFood;

    public Unicorn(String name, String placeOfBirth, String favFood) {
        super(name, placeOfBirth);
        this.favFood = favFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public void print(){
        super.print();
        System.out.println("favorite food: "+favFood+" ");
    }
}
