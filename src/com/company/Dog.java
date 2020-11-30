package com.company;

public class Dog extends Animal{
    private int age;

    public Dog(String name, String placeOfBirth, int age) {
        super(name, placeOfBirth);
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print() {
        super.print();
        System.out.println("Age : "+age+" ");
    }
}
