/* Program 9
Write a program to store lists of roll numbers and total marks of 35 students of a class. Print the maximum of the total marks and the roll number of the student who attained it.
02/02/24 */

import java.util.Scanner;

public class Program9 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int rollnos[] = new int[35];
    int marks[] = new int[35];
    int max = 0, index = 0;

    for (int i = 0; i < 35; i++) {
      System.out.print("Enter roll no: ");
      rollnos[i] = sc.nextInt();
      System.out.print("Enter marks: ");
      marks[i] = sc.nextInt();
    }

    for (int i = 0; i < 35; i++) {
      if (max < marks[i]) {
        max = marks[i];
        index = i;
      }
    }
    System.out.println("Max marks: " + max + ", by roll no. " + rollnos[index]);
  }
}
