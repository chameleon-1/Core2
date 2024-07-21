package task.collection;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void zero(List<Product> products) {
        for (Product p : products) {
            if (p.quantity == 0) {
                System.out.println("todo17: продуктов, которых нет: " + "id " + p.id + ", " + p.name);
            }
        }
    }

    public static void total(List<Product> products) {
        int total1 = 0;
        for (Product p : products) {
            total1 += p.quantity;
        }
        System.out.println("todo17: общее количество продуктов: " + total1 + " единиц");
    }
}
