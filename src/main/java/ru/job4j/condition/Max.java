package ru.job4j.condition;

public class Max {
    private int a;
    private  int b;
    private int c;
    private int d;

    public static int max(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

    }

    public static int max(int a, int b, int c, int d) {
        return max(
                a,
                b,
                max(0, c, d)
        );
    }
}
