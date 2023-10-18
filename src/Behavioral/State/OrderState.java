package Behavioral.State;

public interface OrderState {

        default void pay(Order order) {
            throw new IllegalStateException("Order is already paid");
        }

        default void cancel(Order order) {
            throw new IllegalStateException("Order is already cancelled");
        }

        default void dispatch(Order order) {
            throw new IllegalStateException("Order is already shipped");
        }

        default void refund(Order order) {
            throw new IllegalStateException("Order is already refunded");
        }

        OrderStatus status();

}
