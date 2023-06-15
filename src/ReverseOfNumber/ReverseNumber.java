package ReverseOfNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseOfNumber();
    }

    private static void reverseOfNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
            String reverseOfNumber = String.valueOf(stringBuilder.reverse());
            System.out.println(reverseOfNumber);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
