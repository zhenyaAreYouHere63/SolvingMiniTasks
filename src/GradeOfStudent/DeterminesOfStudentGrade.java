package GradeOfStudent;

import java.util.Scanner;

public class DeterminesOfStudentGrade {
    public static void main(String[] args) {
        DefinitionOfGrade();
    }

    private static void DefinitionOfGrade() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int degree = scanner.nextInt();
                if (degree >= 0 && degree <= 100) {
                    if (degree >= 60 && degree < 65) {
                        System.out.println("E");
                    } else if (degree >= 65 && degree < 75) {
                        System.out.println("D");
                    } else if (degree >= 75 && degree < 85) {
                        System.out.println("C");
                    } else if (degree >= 85 && degree < 95) {
                        System.out.println("B");
                    } else if (degree >= 95) {
                        System.out.println("A");
                    } else {
                        System.out.println("Допка");
                    }
                } else {
                    System.out.println("Неправильне число");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
