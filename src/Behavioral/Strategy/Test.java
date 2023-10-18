package Behavioral.Strategy;



// Implementação funcionando
public class Test {
    public static void main(String[] args) {
        Order order1 = new Order(500.0,6);

        System.out.println(order1.CalculateRatio( new CalculateRateCielo() ) );
        System.out.println(order1.CalculateRatio( new CalculateRateMercadoPago() ) );
        System.out.println(order1.CalculateRatio( new CalculateRatePayPal() ) );






    }
}
