/* Program 4
Write a program to initialize an array of five elements and print their sum.
29/01/24 */

public class Program1 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < arr.length; i++)
      sum += arr[i];

    System.out.println("The sum of the elements is: " + sum);
  }
}


