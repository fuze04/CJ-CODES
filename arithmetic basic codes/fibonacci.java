import java.util.*;
class fibonacci {
  public static void main(String[] fuz) {
Scanner shan= new Scanner(System.in);
    int i = 1, n , n1 = 0, n2 = 1;
    System.out.print("Enter the nth term");
    n=shan.nextInt();

    while (i <= n) {
      System.out.print(n1 + ", ");

      int n3 = n1 + n2;
      n1 = n2;
      n2 = n3;

      i++;
    }
  }
}