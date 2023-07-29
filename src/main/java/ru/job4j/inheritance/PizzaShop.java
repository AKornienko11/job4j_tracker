package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.name());
        PizzaExtraCheese extraCheese = new PizzaExtraCheese();
        System.out.println(extraCheese.name());
        PizzaExtraCheeseExtraTomato extraTomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(extraTomato.name());

    }
}
