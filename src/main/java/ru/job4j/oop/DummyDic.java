package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Hеизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String res = word.engToRus("Unknown word");
        System.out.println(res);
    }
}
