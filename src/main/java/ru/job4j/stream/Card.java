package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(v -> Stream.of(Suit.values())
                        .map(t -> new Card(t, v)))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit="
                + suit
                + ", value="
                + value
                + '}';
    }
}