package Behavioral.Strategy;

public class Order {
    private Double total;
    private int instalments;
    public Order( Double total, int instalments ){
        this.total = total;
        this.instalments = instalments;
    }

    public Double CalculateRatio( CalculateRate rate){
        return rate.calculateRate(instalments);
    }
}
