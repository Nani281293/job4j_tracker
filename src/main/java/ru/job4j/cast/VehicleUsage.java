package ru.job4j.cast;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle busVolvo = new Bus();
        Vehicle train = new Train();
        Vehicle speedTrain = new Train();
        Vehicle airplane = new Airplane();
        Vehicle airBus = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, airplane,
                busVolvo, speedTrain, airBus};
        for (Vehicle object : vehicles) {
            object.move();
            object.typeOfTravel();
        }
    }
}
