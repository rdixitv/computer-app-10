/* Program 14
Write a program to initialize an array with 5 numeric elements and print the array in ascending order using selection sort.
09/02/24 */

public class Program14 {
  public static void main(String[] args) {
    int arr[] = {4, 2, 5, 1, 3};
    int pos, tmp;

    for (int i = 0; i < 5; i++) {
      pos = i;
      for (int j = i + 1; j < 5; j++)
        if (arr[j] < arr[pos])
          pos = j;

      tmp = arr[i];
      arr[i] = arr[pos];
      arr[pos] = tmp;
    }

    System.out.println("Sorted array: ");

    for (int i = 0; i < 5; i++) 
    System.out.println(arr[i]);
  }
}
