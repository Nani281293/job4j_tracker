package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Едит по рельсам");
    }

    @Override
    public void typeOfTravel() {
        System.out.println("Для путешествий внутри страны");
    }
}
