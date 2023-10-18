package Behavioral.State.States;

import Behavioral.State.Order;
import Behavioral.State.OrderState;
import Behavioral.State.OrderStatus;

public class Refunded implements OrderState {
    @Override
    public void cancel(Order order) {
        order.state = new Cancelled();
    }

    @Override
    public OrderStatus status() {
        return OrderStatus.REFUNDED;
    }
}