package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Едит по автомобильным дорогам");
    }

    @Override
    public void typeOfTravel() {
        System.out.println("Для путешествий между городами");
    }
}
