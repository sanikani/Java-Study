package chapter2.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private  Product product;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.product = product;
        order.prime = true;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.product = product;
        order.urgent = true;
        return order;
    }
}
