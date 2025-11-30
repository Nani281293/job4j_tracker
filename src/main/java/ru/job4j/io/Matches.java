package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (true) {
                if (matches > 0 && matches < 4 && matches <= count) {
                    count -= matches;
                    System.out.println(player + " выбрал: " + matches + " спички");
                    System.out.println("На столе осталось: " + count + " спичек\n");
                    if (count == 0) {
                        System.out.println("Выиграл: " + player);
                        break;
                    } else {
                        turn = !turn;
                    }
                    break;
                } else {
                    System.out.println("Количество спичек должно быть от 1 до 3 "
                            + "и не более остатка: " + count);
                    System.out.println(player + " введите число от 1 до 3:");
                    matches = Integer.parseInt(input.nextLine());
                }
            }
        }
    }
}



