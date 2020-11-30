package com.company;

public class Animal implements Printable{
    private String name;
    private String placeOfBirth;

    public Animal(String name, String placeOfBirth) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public void print() {
        System.out.println("name: "+name+"\nPlace of Birth:"+placeOfBirth );
    }
}
