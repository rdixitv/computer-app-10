/* Program 18
Write a program to enter marks of 7 students in an array, sort it in descending order using bubble sort, and print it.
09/02/24 */

import java.util.Scanner;

public class Program18 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[7], tmp, pos;

    for (int i = 0; i < 7; i++) {
      System.out.print("Enter marks " + (i + 1) + ": ");
      marks[i] = sc.nextInt();
    }

    for (int i = 0; i < 7; i++)
      for (int j = 0; j < 6 - i; j++)
        if (marks[j] < marks[j + 1]) {
          tmp = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = tmp;
        }
  
    System.out.println("Sorted array: ");
    for (int i = 0; i < 7; i++)
      System.out.println(marks[i]);
  }
}
