package application;
import java.util.Scanner;
import java.util.Locale;
import utilities.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dolarQnt, dolarPrice, price;

        System.out.print("What is the dolar price? ");
        dolarPrice = sc.nextDouble();
        System.out.print("How many dolars wiil be bought? ");
        dolarQnt = sc.nextDouble();

        price = CurrencyConverter.convert(dolarPrice, dolarQnt);
        System.out.printf("Amount to be paid in reais = %.2f%n", price);

        sc.close();
    }
}
