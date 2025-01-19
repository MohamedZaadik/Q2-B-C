import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfUnits = 6;

        for (int i = 1; i <= numberOfUnits; i++) {
            System.out.print("Enter marks for unit " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double average = totalMarks / (double) numberOfUnits;
        char grade;

        if (average >= 70) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
