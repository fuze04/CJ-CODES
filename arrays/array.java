import java.util.*;
public class array {

  public static void main(String[] args) {
      int n,i,lea=0,mos=0;
      int arr[]=new int[10];

    Scanner fuz= new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the values in the array:");
    for (i=0;i<n;i++) {
      arr[i]=fuz.nextInt();
      
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        
      System.out.println(arr[i]);
      
    }
    
    lea=arr[0];
     for (i=0;i<n;i++) {
         if(arr[i]<lea)
         lea=arr[i];
         
      
    }
    mos=arr[0];
    for (i=0;i<n;i++) {
      if(arr[i]>mos)
      {
      mos=arr[i];
      }
      
    }
    
    System.out.println("the range of the array is from"+lea +"to "+mos);
    


    
  }
}
