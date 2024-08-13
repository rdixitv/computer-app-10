/* Program 70
13/8/24 */

import java.util.Scanner;

public class Latin {
    String name;
    Latin() {
        name = "";
    }

    void input(String n) {
        name = n;
        n += " ";
        String w = "";

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ') {
                if ("aeiou".indexOf(w.charAt(0)) != -1) {
                    System.out.print(w + "yay ");
                } else {
                    System.out.print(w.substring(1) + w.charAt(0) + "ay ");
                }
                w = "";
            } else {
                w += n.charAt(i);
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Latin l = new Latin();
        System.out.print("Enter sentence: ");
        l.input(sc.nextLine());
    }
}
