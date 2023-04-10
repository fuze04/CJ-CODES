import java.util.Scanner;

public class sqroot {
    public static void main(String[] args) {
        int num;
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find Square Root : ");
        num = sc.nextInt();
        res = Math.sqrt(num);
        System.out.println("Result : " + res);
    }
}