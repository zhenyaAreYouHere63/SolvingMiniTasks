package task2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args)
    {
        getSum();
    }

    private static void getSum() {
        int sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Sum of number equals " + sum);
    }
}
