package task1;

import java.util.Scanner;
import java.util.TreeMap;

public class StudentGrade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int numericalOfGrade = scanner.nextInt();
                if (numericalOfGrade >= 0 && numericalOfGrade <= 100) {
                    System.out.println("Letter grade of student: " + getRelationOfGrade().floorEntry(numericalOfGrade).getValue());
                } else {
                    System.out.println("Please enter a correct value");
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }

    private static TreeMap<Integer, LetterGrade> getRelationOfGrade() {
        TreeMap<Integer, LetterGrade> contentOfGrades = new TreeMap<>();
        contentOfGrades.put(0, LetterGrade.N);
        contentOfGrades.put(60, LetterGrade.E);
        contentOfGrades.put(65, LetterGrade.D);
        contentOfGrades.put(75, LetterGrade.C);
        contentOfGrades.put(85, LetterGrade.B);
        contentOfGrades.put(95, LetterGrade.A);
        return contentOfGrades;
    }
}
