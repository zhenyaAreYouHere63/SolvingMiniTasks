package task1;

import java.util.TreeMap;

public class DefinerOfMark {
    public LetterGrade getLetterMark(int number) {
        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Please enter the correct value");
        } else {
            return getRelationOfGrade(number);
        }
    }

    private LetterGrade getRelationOfGrade(int number) {
        TreeMap<Integer, LetterGrade> contentOfGrades = new TreeMap<>();
        contentOfGrades.put(0, LetterGrade.N);
        contentOfGrades.put(60, LetterGrade.E);
        contentOfGrades.put(65, LetterGrade.D);
        contentOfGrades.put(75, LetterGrade.C);
        contentOfGrades.put(85, LetterGrade.B);
        contentOfGrades.put(95, LetterGrade.A);
        return contentOfGrades.floorEntry(number).getValue();
    }
}
