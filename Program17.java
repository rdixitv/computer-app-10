/* Program 17
Write a program to initialize five names into an array and print them in alphabetical order using selection sort.
09/02/24 */

public class Program17 {
  public static void main(String args[]) {
    String arr[] = {"Pranav", "Naveen", "Samarth", "Yug", "Raghav"};
    int pos;
    String tmp;
    for (int i = 0; i < 5; i++) {
      pos = i;
      for (int j = i + 1; j < 5; j++)
        if (arr[j].compareTo(arr[pos]) < 0)
          pos = j;

      tmp = arr[i];
      arr[i] = arr[pos];
      arr[pos] = tmp;
    }
      
    System.out.println("Sorted array:");
    for (int i = 0; i < 5; i++)
      System.out.println(arr[i]);
  }
}
