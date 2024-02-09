/* Program 15
Write a program to initialize an alphanumeric character array of size 8 and print the contents of the array indescending order using selection sort.
09/02/24 */

public class Program15 {
  public static void main(String[] args) {
    char arr[] = {'b', '5', '3', 'X', '0', 'L', 'a', '4'};
    int pos;
    char tmp;

    for (int i = 0; i < 8; i++) {
      pos = i;
      for (int j = i + 1; j < 8; j++)
        if (arr[j] < arr[pos])
          pos = j;

      tmp = arr[i];
      arr[i] = arr[pos];
      arr[pos] = tmp;
    }

    System.out.println("Sorted array: ");

    for (int i = 0; i < 8; i++) 
    System.out.println(arr[i]);
  }
}
