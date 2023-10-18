package Behavioral.Strategy;

public class CalculateRateCielo implements CalculateRate{
    Double Ratio = 4.99;
    @Override
    public Double calculateRate(int instalments) {

        if (instalments == 1) return Ratio;

        return Ratio + (instalments * 1.99);

    }
}
