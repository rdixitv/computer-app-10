/* Program 7
Two single dimension arrays contain elements as follows:
X[10] = 5, -3, -2, 1, 0, 12, 14, 16, 25, 13
Y[8] = 6, 5, 10, 15, 18, 20, 22, 30
Write a program that results in an array as follows:
Z[18] = 5, 6, -3, 5, -2, 10, 1, 15, 0, 18, 12, 20, 14, 22, 16, 30, 25, 13
02/02/24 */

public class Program7 {
  public static void main(String args[]) {
    int X[] = {5, -3, -2, 1, 0, 12, 14, 16, 25, 13};
    int Y[] = {6, 5, 10, 15, 18, 20, 22, 30};
    int Z[] = new int[18];

    for (int i = 0; i < 9; i++)
      Z[i * 2] = X[i];
    Z[17] = X[9];

    for (int i = 0; i < 8; i++)
      Z[i * 2 + 1] = Y[i];

    for (int i = 0; i < 18; i++)
      System.out.println(Z[i]);
  }
}
