/* Program 11
Write a program to enter names of 10 students in an array and ask the user to enter name and locate that particular student using linear search.
05/02/24 */

import java.util.Scanner;

public class Program11 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String names[] = new String[10], name = "";
    int i = 0;
    boolean flag = false;
    
    for (int j = 0; j < 10; j++) {
      System.out.print("Enter name: ");
      names[j] = sc.next();
    }

    System.out.print("Enter your name: ");
    name = sc.next();

    for (; i < 10; i++)
      if (names[i].equals(name)) {
        flag = true;
        break;
      }

    System.out.println(name + (flag ? " is at pos " + (i + 1) : " is not in the array."));
  }
}
