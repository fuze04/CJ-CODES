import java.util.*;

public class Array2arrPoint {
   static int n;
   static int[] arr;
   static int lea, mos;

   public static void main(String[] args) {
      Scanner fuz = new Scanner(System.in);
      System.out.print("Enter 1 to work with array, Enter 2 to work with points: ");
      int choice = fuz.nextInt();

      switch (choice) {
         case 1:
            System.out.print("Enter the size of the array: ");
            n = fuz.nextInt();
            arr = new int[n];

            System.out.print("Enter the values in the array: ");
            for (int i = 0; i < n; i++) {
               arr[i] = fuz.nextInt();
            }

            System.out.println("Displaying the array");
            for (int i = 0; i < n; i++) {
               System.out.println(arr[i]);
            }

            lea = arr[0];
            for (int i = 0; i < n; i++) {
               if (arr[i] < lea)
                  lea = arr[i];
            }

            mos = arr[0];
            for (int i = 0; i < n; i++) {
               if (arr[i] > mos) {
                  mos = arr[i];
               }
            }

            System.out.println("The range of the array is from " + lea + " to " + mos);
            break;

         case 2:
            class arrPoint {
               int xcrd;
               int ycrd;

               void getpt() {
                  Scanner fuz = new Scanner(System.in);
                  System.out.print("\nEnter the x co-ordinate: ");
                  xcrd = fuz.nextInt();
                  System.out.print("Enter the y co-ordinate: ");
                  ycrd = fuz.nextInt();
               }

               void showpt() {
                  System.out.print("The  co ordinate is " + xcrd + "," + ycrd + "\n");

                  System.out.println("-----------------------------------------------------------");
               }

               int distorig() {
                  int a = xcrd * xcrd;
                  int b = ycrd * ycrd;
                  int c = (int) Math.sqrt(a + b);
                  return (c);
               }

               int diffbtw(arrPoint p2) {
                  int a = (p2.xcrd - xcrd) * (p2.xcrd - xcrd);
                  int b = (p2.ycrd - ycrd) * (p2.ycrd - ycrd);
                  int e = (int) Math.sqrt(a + b);
                  return (e);
               }
            }
            arrPoint[] ptarr;
           
System.out.print("Enter the size of the array: ");
    n = fuz.nextInt();
    ptarr = new arrPoint[n];

    int near = 100, far = 0, pos = 0, p = 0;

    for (int i = 0; i < n; i++) {
      ptarr[i] = new arrPoint();
      ptarr[i].getpt();
      ptarr[i].showpt();

      int k = ptarr[i].distorig();
      System.out.print("The distance from origin = " + k);

      if (k > far) {
        far = k;
        pos = i;
      }
      if (k < near) {
        near = k;
        p = i;
      }
    }
    System.out.print("The farest distance from origin = " + far + " and the position is " + pos + "\n");
    System.out.print("The nearest distance from origin = " + near + " and the position is " + p + "\n");
    break;

  default:
    System.out.println("Invalid choice. Enter 1 or 2.");
}
}
}