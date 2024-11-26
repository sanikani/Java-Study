package chapter2.item01;

import java.util.EnumMap;

public enum OrderStatus {
    PREPARING(0), SHIPPED(1), DELIVERED(2), DELIVERING(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }

}
