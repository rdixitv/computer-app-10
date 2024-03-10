/* Program 29
Write a program to enter 9 names in a 2D array with n rows and n columns. Print the left diagonal elements of the matrix.
19/2/24 */

import java.util.Scanner;

public class Program29 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = 3;
    String arr[][] = new String[n][n];
    int i = 0;
    for (; i < n; i++)
      for (int j = 0; j < n; j++) {
        System.out.print("Enter a name: ");
        arr[i][j] = sc.next();
      }

    for (i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.print(arr[i][j] + "\t");
      System.out.println();
    }

    for (i = 0; i < n; i++) {
      System.out.println(arr[i][i]);  
    }
  }
}
