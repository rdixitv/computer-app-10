/* Program 27
Write a program to enter numbers in a 2D array with size n * n and print the sum of the diagonal elements (left and right).
19/2/24 */

import java.util.Scanner;

public class Program27 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows: ");
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    int i = 0;
    for (; i < n; i++)
      for (int j = 0; j < n; j++) {
        System.out.print("Enter a number: ");
        arr[i][j] = sc.nextInt();
      }

    for (i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print(arr[i][j] + "\t");
      System.out.println();
    }

    int lsum = 0, rsum = 0;
    for (i = 0; i < n; i++) {
      lsum += arr[i][i];
      rsum += arr[i][n - i - 1];
    }
    System.out.println("Left sum = " + lsum + "\nRight sum = " + rsum);  
  }
}
