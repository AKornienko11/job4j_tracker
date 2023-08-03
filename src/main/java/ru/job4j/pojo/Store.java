package ru.job4j.pojo;

public class Store {
    public static int indexOfNull(Product[] products) {
        int result = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[5];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int index = 0; index < products.length; index++) {
            Product pr = products[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }

        }
        System.out.println("Replace milk to oil");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int index = 0; index < products.length; index++) {
            Product pr = products[index];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }

        System.out.println(" Show only product.count > 10 ");
        for (int index = 0; index < products.length; index++) {
            Product pr = products[index];
            if (pr != null && pr.getCount() > 10) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}

