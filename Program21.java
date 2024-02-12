/* Program 21
 Write a program to initialize 9 numbers into a 2D array and print it out in matrix format using tab
12/02/24 */

public class Program21 {
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
