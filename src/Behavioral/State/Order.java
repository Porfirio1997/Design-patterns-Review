package Behavioral.State;

public class Order {
    Double Total;
    public OrderState state;

    Order( Double Total, OrderState state ) {
        this.Total = Total;
        this.state = state;
    }
    public void pay() {state.pay(this);}
    public void cancel(){ state.cancel(this);}

    public void dispatch(){ state.dispatch(this);}

    public void refund(){ state.refund(this);}

    public OrderStatus status(){
        return state.status();
    }

}
