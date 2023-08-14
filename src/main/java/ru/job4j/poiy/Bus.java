package ru.job4j.poiy;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println(" Автобус везет пассажиров по маршруту ");

    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Автобус может перевозить максимум " + passengers + "пассажиров");
    }

    @Override
    public double refuel(int fuel) {
        return 50.5 * fuel;
    }
}
