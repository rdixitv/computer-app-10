/* Program 24
Write a program to enter numbers in a 2D array with n rows and m columns and print it in a matrix format.
12/02/24 */

import java.util.Scanner;

public class Program24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        int n, m;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        m = sc.nextInt();
        arr = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                System.out.print("Enter a number: ");
                arr[i][j] = sc.nextInt();
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
