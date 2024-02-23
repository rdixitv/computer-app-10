/* Program 31
Write a program to enter the names of students into an array and marks in another array. Enter marks obtained by 10 students in 2 tests. Calculate the total marks obtained by each student and print the name of the student along with the total marks obtained.
23/02/24 */

import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];
        int marks[][] = new int[10][2], m, i = 0;

        for (; i < 10; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter marks 1: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter marks 2: ");
            marks[i][1] = sc.nextInt();
        }

        System.out.println("Name\tTotal Marks");
        for (i = 0; i < 10; i++)
            System.out.println(names[i] + "\t" + (marks[i][0] + marks[i][1]));
    }
}
