package Entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double price, double amount){
        return (amount + (amount * IOF)) * price;
    }
}
