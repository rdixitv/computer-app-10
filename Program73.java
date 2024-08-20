/* Program 73
20/08/24 */

import java.util.Scanner;

public class Sort {
    int arr[], i, j, temp;
    void inputdata() {
        Scanner sc = new Scanner(System.in);
        arr = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
    }

    void arrange() {
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void outputdata() {
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Sort s = new Sort();
        s.inputdata();
        s.arrange();
        s.outputdata();
    }
}
