/* Program 30
Write a program to enter the names of 5 students into an array and marks obtained in a test in another array, Display the highest marks obtained, along with the name of the student.
23/2/24 */

import java.util.Scanner;

public class Program30 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String names[] = new String[5];
    int marks[] = new int[5], m = 0, i = 0;

    for (; i < 5; i++) {
      System.out.print("Enter a name: ");
      names[i] = sc.next();
      System.out.print("Enter their marks: ");
      marks[i] = sc.nextInt();
    }

    for (i = 0; i < 5; i++)
      if (marks[i] > marks[m])
        m = i;

    System.out.println("Max marks: " + marks[m] + " scored by " + names[m]);
  }
}
