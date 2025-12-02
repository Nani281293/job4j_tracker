package ru.job4j.polymorphism;

public class Bus implements Transport {
    public int passengerCount;

    @Override
    public void passengers(int count) {
        this.passengerCount = count;
    }

    @Override
    public void move() {
        System.out.println("Автобус стоит не двигается");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 64;
    }
}
