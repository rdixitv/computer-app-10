/* Program 5
Write a program to accept 20 numbers and print only the even numbers from the array.
02/02/24 */

import java.util.Scanner;

public class Program5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[20];

    for (int i = 0; i < 20; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < 20; i++) {
      System.out.print(arr[i] % 2 == 0 ? arr[i] + "\n" : "");
    }
  }
}
