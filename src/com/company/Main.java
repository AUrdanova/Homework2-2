package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dog").print();
        createObject("Cat").print();
        createObject("Unicorn").print();

    }

    public static Printable createObject(String className) {

        if (className == null) {
            return null;
        }
        Printable c = null;
        switch (className) {
            case "Dog":
                c = new Dog("Sharik", "Bishkek", 3);
                break;
            case "Cat":
                c = new Cat("Busya", "China", "White");
                break;
            case "Unicorn":
                c = new Unicorn("Glory","Usa","Skittles");
        }
        return c;
    }
}
