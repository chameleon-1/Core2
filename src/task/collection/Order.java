package task.collection;

import java.util.List;

public class Order {
    private int id;
    private String customer;
    private int totalAmount;

    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public static void maxAmount(List<Order> orders) {
        int maxAmount = 0;
        String richBich = null;
        for (Order o : orders) {
            if (o.totalAmount > maxAmount) {
                maxAmount = o.totalAmount;
                richBich = o.customer;
            }
        }
        System.out.println("todo14: наибольший заказ у "+richBich +", он равен " + maxAmount);
    }

    public static void total(List<Order> orders) {
        int total = 0;
        for (Order o : orders) {
            total += o.totalAmount;
        }
        System.out.println("todo14: общая сумма всех заказов: "+ total);
    }
}
