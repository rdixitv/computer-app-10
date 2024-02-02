/* Program 3
Write a program to enter ten numbers in an array and print the values of those cells whose subscripts are odd.
29/01/24 */

import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }

    for (int i = 1; i < arr.length; i += 2)
      System.out.println(arr[i]);
  }
}


