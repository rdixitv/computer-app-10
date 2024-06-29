/* Program 59
Design a class to input a string and display all the vowels present in it.
29/6/24 */

import java.util.Scanner;
public class Program59 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        for (int i = 0; i < s.length(); i++)
            System.out.print("aeiou".indexOf(s.charAt(i)) != -1 ? s.charAt(i) : "");
    }
}
