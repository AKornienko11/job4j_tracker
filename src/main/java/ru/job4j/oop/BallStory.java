package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        System.out.println("The Wolf: ");
        wolf.tryEat(ball);
        System.out.println("The Hare: ");
        hare.tryEat(ball);
        System.out.println("The Fox: ");
        fox.tryEat(ball);
    }
}
