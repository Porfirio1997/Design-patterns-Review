package Behavioral.State;

import Behavioral.State.States.WaitingPayment;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(100.0, new WaitingPayment());
        System.out.println(order.status());
        order.pay();
        System.out.println(order.status());
        order.dispatch();
        System.out.println(order.status());
        order.refund();
        System.out.println(order.status());
        order.cancel();
        System.out.println(order.status());
    }
}
