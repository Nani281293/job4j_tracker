package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        do {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches < 4 && matches <= count) {
                count -= matches;
                System.out.println(player + " выбрал: " + matches + " спички");
                System.out.println("На столе осталось: " + count + " спичек\n");
                if (count == 0) {
                    System.out.println("Выиграл: " + player);
                } else {
                    turn = !turn;
                }
            } else {
                System.out.println("Количество спичек должно быть от 1 до 3 "
                        + "и не более остатка: " + count);
            }
        } while (count > 0);
    }
}



