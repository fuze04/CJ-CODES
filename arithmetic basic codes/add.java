import java.util.*;

 class add {
    public static void main(String[] pwd) {
        int num1, num2, sum;
        System.out.println("Enter the 2 num:");
        Scanner ans = new Scanner(System.in);
        num1 = ans.nextInt();
        num2 = ans.nextInt();

        sum = num1 + num2;

        System.out.println("the sum of the number" + num1 + "and " + num2 + " is " + sum);

    }
}