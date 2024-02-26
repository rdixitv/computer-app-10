/* Program 37
Write a program to print the table of 3
24/2/23 */

public class Program37 {
  public static void main(String[] args) {
    table(3);
  } 

  static void table(int n) {
    for (int i = 1; i <= 10; i++)
      System.out.println(n + " * " + i + " = " + (n * i));
  }
}
