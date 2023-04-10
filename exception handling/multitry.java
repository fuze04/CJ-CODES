import java.util.*;

class multitry {

    public static void main(String[] args) {
        int arr[] = new int[8]; 
         
        int n = 4;
        int d = 0;
        int a;

        try {
            //a = n / d; 
              arr[12] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Array size out of bounds");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
