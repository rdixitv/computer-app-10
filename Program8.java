/* Program 8
Write a program to enter marks and names of 10 students and print them in a formatted tabular manner.
02/02/24 */

import java.util.Scanner;
public class Program8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String names[] = new String[10];
    int marks[] = new int[10];

 
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter name: ");
      names[i] = sc.next();
      System.out.print("Enter marks: ");
      marks[i] = sc.nextInt();
    }

    System.out.println("Name\t\tMarks");
    for (int i = 0; i < 10; i++)
      System.out.println(names[i] + "\t\t" + marks[i]);
  }
}
