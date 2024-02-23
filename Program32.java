/* Program 32
Write a program to enter the names of 5 cities into a city array and the highest and lowest temperatures recorded in the cities into a 2D array temperature. Display the city corresponding to the highest and the lowest temperature.
23/02/24 */

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cities[] = new String[5];
        int tmps[][] = new int[5][2], max = 0, min = 0, i = 0;

        for (; i < 5; i++) {
            System.out.print("Enter city: ");
            cities[i] = sc.next();
            System.out.print("Enter highest temperature: ");
            tmps[i][0] = sc.nextInt();
            System.out.print("Enter lowest temperature: ");
            tmps[i][1] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (tmps[i][0] > tmps[max][0])
                max = i;
            if (tmps[i][1] < tmps[min][1])
                min = i;
        }
        System.out.println("Highest temperature: " + tmps[max][0] + " in " + cities[max] + "\nLowest temperature: " + tmps[min][1] + " in " + cities[min]);
    }
}
