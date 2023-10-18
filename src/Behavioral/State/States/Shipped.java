package Behavioral.State.States;

import Behavioral.State.Order;
import Behavioral.State.OrderState;
import Behavioral.State.OrderStatus;

public class Shipped implements OrderState {
    @Override
    public void refund(Order order) {
        order.state = new Refunded();
    }

    @Override
    public OrderStatus status() {
        return OrderStatus.SHIPPED;
    }
}