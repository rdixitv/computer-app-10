/* Program 2
Write a program to enter ten numbers into an array and print it in reverse order.
29/01/24 */

import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }

    for (int i = arr.length - 1; i >= 0; i--)
      System.out.println(arr[i]);
  }
}


