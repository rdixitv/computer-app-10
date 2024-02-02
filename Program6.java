/* Program 6
Write a program to accept values into two arrays of ten cells each. Store the sum of the corresponding cells in an array. Display the resultant array.
02/02/24 */

import java.util.Scanner;

public class Program6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr1[] = new int[10];
    int arr2[] = new int[10];
    int arr3[] = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter a number for array 1: ");
      arr1[i] = sc.nextInt();
      System.out.print("Enter a number for array 2: ");
      arr2[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      arr3[i] = arr1[i] + arr2[i];
      System.out.println(arr3[i]);
    }
  }
}
