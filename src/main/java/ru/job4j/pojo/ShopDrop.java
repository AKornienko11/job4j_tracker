package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            if (index == i && i == products.length - 1) {
                products[i] = null;
                break;
            }
            if (index == i) {
                products[i] = null;
                products[i] = products[i + 1];
                products[i + 1] = null;
            } else if (products[i] == (null)) {
                products[i] = null;
                products[i] = products[i + 1];
                products[i + 1] = null;
            }

        }

        return products;
    }
}


