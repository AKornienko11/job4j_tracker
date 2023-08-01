package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Война и мир", 1300);
        Book poem = new Book("Руслан и Людмила", 500);
        Book story = new Book("Собачье сердце", 288);
        Book textbook = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = poem;
        books[2] = story;
        books[3] = textbook;
        System.out.println("Список литературы : ");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println(" Замена мест ячеек 0 и 3 ");
        books[0] = textbook;
        books[3] = novel;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        System.out.println("Вывод книги с определенным названием");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}

