/* Program 22
 Write a program to initialize 9 characters into a 2D array and print it in reverse order in matrix format using tab
12/02/24 */

public class Program22 {
    public static void main(String args[]) {
        char arr[][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};

        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
