import java.util.Scanner;

public class gcdLcm {

    public static void main(String[] args) {

        int n1, n2, gcd, lcm;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter value for n2: ");
        n2 = sc.nextInt();

        // initialization
        gcd = 1;
        lcm = (n1 > n2) ? n1 : n2;

        // GCD
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        // LCM
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0)
                break;
            ++lcm;
        }

        // gcd = (n1 * n2) / lcm;
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }

}