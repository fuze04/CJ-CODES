import java.util.*;

public class selectionsort {
public static void main(String[] args) {
int[] arr = new int[30];
int n, i, j, lea, pos;


Scanner sc = new Scanner(System.in);
System.out.print("How many values: ");
n = sc.nextInt();

System.out.print("\nEnter the elements you want to sort: ");
for (i = 0; i < n; i++)
  arr[i] = sc.nextInt();

// Sorting
for (i = 0; i < n - 1; i++) {
  lea = arr[i];
  pos = i;
  for (j = i + 1; j < n; j++)
    if (lea > arr[j]) {
      lea = arr[j];
      pos = j;
    } // Finding least element
  arr[pos] = arr[i]; // swapping least no. with first element
  arr[i] = lea;
}

System.out.print("\nSorted Array: ");
for (i = 0; i < n; i++)
  System.out.print("\n" + arr[i]);


}
}
