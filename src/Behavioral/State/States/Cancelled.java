package Behavioral.State.States;

import Behavioral.State.OrderState;
import Behavioral.State.OrderStatus;

public class Cancelled implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.CANCELLED;
    }
}