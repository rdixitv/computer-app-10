/* Program 28
Write a program to enter numbers in a 2D array with n rows and m columns and print the upper left half of the array. Print the original array as well.
19/2/24 */

import java.util.Scanner;

public class Program28 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows: ");
    int n = sc.nextInt();
    System.out.print("Enter columns: ");
    int m = sc.nextInt();
    int arr[][] = new int[n][m];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++) {
        System.out.print("Enter a number: ");
        arr[i][j] = sc.nextInt();
      }

    for (int i = 0; i < n; i++)  {
      for (int j = 0; j < m; j++)
        System.out.print(arr[i][j] + "\t");
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i + 1; j++)
        System.out.print(arr[i][j] + "\t");
      System.out.println();
    }
  }
}
