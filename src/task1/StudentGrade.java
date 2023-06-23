package task1;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int numericalOfGrade = scanner.nextInt();
                DefinerOfMark definerOfMark = new DefinerOfMark();
                System.out.println("Letter grade of student: " + definerOfMark.getLetterMark(numericalOfGrade));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}