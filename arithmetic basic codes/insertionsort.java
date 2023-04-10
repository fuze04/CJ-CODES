import java.util.*;;

class insertionsort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[30];
    int n, i, j, k;

    System.out.print("How many elements are there? ");
    n = sc.nextInt();

    System.out.print("The list of array elements is: ");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (i = 1; i < n; i++) {
      k = arr[i];
      j = i - 1;
      while (j >= 0 && arr[j] > k) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = k;
    }

    System.out.print("Array After Sorting using 'Insertion Sort Algorithm':\n");
    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + ",");
    }
    
  }
}
