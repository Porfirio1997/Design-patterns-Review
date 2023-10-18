package Behavioral.Strategy;

public class CalculateRatePayPal implements CalculateRate {
    Double Ratio = 5.0;
    @Override
    public Double calculateRate(int instalments) {

        if (instalments == 1) return Ratio;

        return instalments * 3.0;

    }
}
