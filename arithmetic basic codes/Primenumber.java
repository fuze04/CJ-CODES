import java.util.*;
public class primenumber {

  public static void main(String[] args) {
      int rem,n,flag=0,i;

    Scanner fuz= new Scanner(System.in);
    System.out.print("Enter the Number to check whether it is prime or not:");
    
    n=fuz.nextInt();
    

    for (i=2;i<n;i++) {
      rem=n%i;
      // condition for nonprime number
      if (rem == 0) {
         flag = 1;
        break;
      }
    }

    if (flag==0)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
  }
}
