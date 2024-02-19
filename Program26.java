/* Program 26
Write a program to enter numbers in a 2D array with n rows and m columns and print the sum of the elements in each column.
19/2/24 */

import java.util.Scanner;

public class Program26 {
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

    int sum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++)
        System.out.print(arr[i][j] + "\t");
      System.out.println();
    }
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        sum += arr[j][i];

      System.out.println("Sum of column " + (i + 1) + ": " + sum);
      sum = 0;
    }
  }
}
