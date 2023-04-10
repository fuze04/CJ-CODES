import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, op;
        System.out.println("Enter a number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2 : ");
        num2 = sc.nextInt();

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5.Modulus");
        System.out.println("Enter your choice: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Addition is : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction is : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication is : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division is : " + (num1 / num2));
                break;
             case 5:
                 System.out.println("Modulus  is : " + (num1 % num2));
                 break;
            default:
                System.out.println("Invalid Option selected. Rerun the program!");
                break;
        }
    }
}
