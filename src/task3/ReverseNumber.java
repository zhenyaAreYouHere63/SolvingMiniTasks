package task3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                getReverseOfNumber(scanner.nextInt());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void getReverseOfNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number /= 10;
        }
        System.out.println("Reverse number " + reverseNumber);
    }
}
