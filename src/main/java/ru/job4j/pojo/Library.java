package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", 1000);
        Book fathersAndSun = new Book("Отцы и дети", 300);
        Book atBottom = new Book("На дне", 250);
        Book cleanCode = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = warAndPeace;
        books[1] = fathersAndSun;
        books[2] = atBottom;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Меняем содержимое 0 и 3 index");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Добавляем цикл с выводом книг с именем Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPage());
            }
        }
    }
}
