/* Program 23
Write a program to enter 9 numbers into a 2D array and print a matrix displaying only the even numbers of the array.
12/02/24 */

import java.util.Scanner;

public class Program23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a character: ");
                arr[i][j] = sc.next().charAt(0);
            }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print((arr[i][j] % 2 == 0 ? arr[i][j] : '*') + "\t");
            System.out.println();
        }
    }
}
