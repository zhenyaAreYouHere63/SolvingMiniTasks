package SumaOfNumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        calculationOfSuma();
    }

    private static void calculationOfSuma() {
        int suma = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                suma += scanner.nextInt();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(suma);
    }
}
