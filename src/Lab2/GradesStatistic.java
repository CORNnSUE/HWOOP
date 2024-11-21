package Lab2;

import java.util.Scanner;
import java.util.Arrays;


public class GradesStatistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        representGradesStatistic(scanner);
    }

    public static void representGradesStatistic(Scanner scanner) {
        System.out.print("Enter the number of students: ");
        int numStudent = scanner.nextInt();

        int studentGrades[] = new int[numStudent];

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            studentGrades[i] = scanner.nextInt();

            while (studentGrades[i] < 0 || studentGrades[i] > 100) {
                System.out.print("Enter the  valid " + (i + 1) + ": ");
                studentGrades[i] = scanner.nextInt();
            }
        }

        System.out.printf("The average is: %.2f%n", findTheAverageGrade(studentGrades));
        System.out.println("The minimum is: " + findTheMinimumGrade(studentGrades));
        System.out.println("The maximum is: " + findTheMaximumGrade(studentGrades));
        System.out.println("The median is: " + findTheMedianGrade(studentGrades));
        System.out.printf("The standard deviatation is: %.2f%n", findThestandardDev(studentGrades));

    }

    private static double findTheAverageGrade(int studentGrades[]) {
        if (studentGrades == null) {
            return -1.0;
        }
        double average = 0.0;
        for (int i = 0; i < studentGrades.length; i++) {
            average += 1.0 * studentGrades[i];
        }
        average /= (1.0 * studentGrades.length);
        return average;
    }

    private static int findTheMinimumGrade(int studentGrades[]) {
        if (studentGrades == null) {
            return -1;
        }
        int min = studentGrades[0];
        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] < min)
                min = studentGrades[i];
        }
        return min;
    }

    private static int findTheMaximumGrade(int studentGrades[]) {
        if (studentGrades == null) {
            return -1;
        }
        int max = studentGrades[0];
        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] > max)
                max = studentGrades[i];
        }
        return max;
    }

    private static double findTheMedianGrade(int studentGrades[]) {
        if (studentGrades == null) {
            return -1.0;
        }
        Arrays.sort(studentGrades);
        if (studentGrades.length % 2 != 0) {
            return studentGrades[studentGrades.length / 2] * 1.0;
        }
        return (studentGrades[studentGrades.length / 2] * 1.0 + studentGrades[studentGrades.length / 2 - 1] * 1.0) / 2;
    }

    private static double findThestandardDev(int studentGrades[]) {
        if (studentGrades == null) {
            return -1.0;
        }
        double sigmaSum = 0.0;
        for (int i = 0; i < studentGrades.length; i++) {
            sigmaSum += (studentGrades[i] * studentGrades[i] * 1.0);
        }
        return Math.sqrt(sigmaSum / studentGrades.length - Math.pow(findTheAverageGrade(studentGrades), 2));
    }
}
