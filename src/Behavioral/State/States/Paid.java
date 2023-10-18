package Behavioral.State.States;

import Behavioral.State.Order;
import Behavioral.State.OrderState;
import Behavioral.State.OrderStatus;

public class Paid implements OrderState {
    @Override
    public void cancel(Order order) {
        order.state = new Cancelled();
    }
    @Override
    public void dispatch(Order order) {
        order.state = new Shipped();
    }
    @Override
    public OrderStatus status() {
        return OrderStatus.PAID;
    }
}
