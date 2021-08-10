package util;

public class CurrencyConverter {
    private static final double iof = 0.06;
    public static double usdPrice;
    public static double usdQuantity;

    public static double Converter() {
        double tax = ((usdQuantity * usdPrice) * iof);
        return ((usdQuantity * usdPrice) + tax);
    }
}


