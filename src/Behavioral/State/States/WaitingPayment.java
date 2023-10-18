package Behavioral.State.States;

import Behavioral.State.Order;
import Behavioral.State.OrderState;
import Behavioral.State.OrderStatus;

public class WaitingPayment implements OrderState {
    @Override
    public void pay(Order order) {
        order.state = new Paid();
    }

    @Override
    public void cancel(Order order) {
        order.state = new Cancelled();
    }

    @Override
    public OrderStatus status() {
        return OrderStatus.WAITING_PAYMENT;
    }
}