import java.util.*;

 class twodarray {

  public static void main(String[] args) {
      int n,i,j,m;
      int arr[][]=new int[10][10];

    Scanner fuz= new Scanner(System.in);
    System.out.print("Enter the row size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the coloumn size of the array:");
    m=fuz.nextInt();
    
    System.out.print("Enter the values in the array:");
    for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
      arr[i][j]=fuz.nextInt();
        }
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
        
      System.out.print(arr[i][j]+"  ");
    }
      System.out.println();
    
    }
       System.out.print("Displaying the Transpose of the  array\n");
 for (i=0;i<m;i++) {
        for(j=0;j<n;j++)
        {

             System.out.print(arr[j][i]+" ");

     }//---end of j loop
System.out.println();
  }//---end of i loop
    
  }//---end of public statement
}//---end of main

