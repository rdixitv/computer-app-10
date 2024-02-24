/* Program 34
Write a program to print the table of 3
24/2/23 */

public class Program34 {
  public static void main(String[] args) {
    table();
  } 

  static void table() {
    for (int i = 1; i < 10; i++)
      System.out.println("3 * " + i + " = " + (3 * i));
  }
}
