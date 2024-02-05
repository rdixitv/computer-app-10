/* Program 10
Write a program to enter 10 elements in an integer array a. Apply linear search technique to find the element entered by the user.
05/02/24 */

import java.util.Scanner;

public class Program10 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10], num = 0, i = 0;
    boolean flag = false;
    
    for (int j = 0; j < 10; j++) {
      System.out.print("Enter number: ");
      a[j] = sc.nextInt();
    }

    System.out.print("Enter a number to search for: ");
    num = sc.nextInt();

    for (; i < 10; i++)
      if (a[i] == num) {
        flag = true;
        break;
      }

    System.out.println(num + (flag ? " is at pos " + (i + 1) : " is not in the array."));
  }
}
