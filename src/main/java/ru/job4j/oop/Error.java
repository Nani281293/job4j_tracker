package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Ошибка активная: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Необходимые действия: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.print();
        Error errorActive = new Error(true, 1, "reboot");
        errorActive.print();
        Error errorNotActive = new Error(false, 0, "Система работоспособна");
        errorNotActive.print();
    }

}
