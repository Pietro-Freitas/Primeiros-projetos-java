package utilities;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double convert(double dolarQnt, double dolarPrice){
        return dolarQnt*dolarPrice*IOF;
    }
}