package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint contect = new Paint();
        contect.draw(new Triangle());
        contect.draw(new Square());
    }
}
