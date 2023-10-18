package Behavioral.Strategy;

public class CalculateRateMercadoPago implements CalculateRate {
    Double Ratio = 2.0;
    @Override
    public Double calculateRate(int instalments) {

        if (instalments == 1) return Ratio;

        return (instalments * 1.99) + 5.0;

    }
}
