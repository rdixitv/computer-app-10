/* Program 1
Write a program to enter ten numbers into an array and print it out.
29/01/24 */

import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length; i++)
      System.out.println(arr[i]);
  }
}


