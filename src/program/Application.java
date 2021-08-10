package program;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.usdPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.usdQuantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.Converter());

        sc.close();
    }
}
