/* Program 25
Write a program to enter numbers in a 2D array with n rows and m columns and print the sum of the elements in each row.
19/2/24 */

import java.util.Scanner;

public class Program25 {
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
    
    System.out.println("Array: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++)
        sum += arr[i][j];

      System.out.println("Sum of row " + (i + 1) + ": " + sum);
      sum = 0;
    }
  }
}
