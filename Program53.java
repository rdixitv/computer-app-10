/* Program 53
Design a class to input a string, change the case of each character of the string and display the new string.
25/06/24 */

import java.util.Scanner;

public class Program53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res += Character.isLowerCase(c) ? Character.toUpperCase(c) :
                   Character.isUpperCase(c) ? Character.toLowerCase(c) : c;
        }
        
        System.out.println(res);
    }
}
