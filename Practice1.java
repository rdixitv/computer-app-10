import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int res = factorial(n);
        System.out.println(res);
    }

    static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    // static int factorial(int n) {
    //     if (n > 1)
    //         return n * factorial(n - 1);
    //     else
    //         return 1;
    // }
    //
}
