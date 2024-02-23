/* Program 33
Write a program to enter the marks obtained by 10 students in 3 subjects and calculate the grades for each student based on average marks:
Avg marks         Grade
<=45              D
> 45 and <=60     C
>60 and <=75      B
>75               A
23/02/24 */

import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];
        double marks[][] = new double[10][3], avg;
        int i = 0;
        char grade;
        for (; i < 10; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks " + (j + 1) + ": ");
                marks[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Name\tGrade");
        for (i = 0; i < 10; i++) {
            avg = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            System.out.println(names[i] + "\t" + (avg <= 45 ? 'D' : avg <= 60 ? 'C' : avg <= 75 ? 'B' : 'A'));
        }
    }
}
