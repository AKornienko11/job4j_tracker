package ru.job4j.oop;

public class Error {

    public boolean active;
    public int status;
    public String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void show() {
        System.out.println("Высокая активность - " + active);
        System.out.println("Получено " + status + " заявок");
        System.out.println("Опоздания " + message);
    }

    public static void main(String[] args) {
        Error empty = new Error();
        empty.show();
        Error highRisk = new Error(true, 100, "возможны");
        highRisk.show();
        Error averageRisk = new Error(true, 50, " мало вероятны");
        averageRisk.show();
        Error lowRisk = new Error(false, 5, " не возможны");
        lowRisk.show();
    }
}
