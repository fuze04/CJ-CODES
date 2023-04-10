import java.util.*;

 class Bubble {

  public static void main(String[] args) {
    

int arr[]=new int[10];
int n,i,j,lea,pos;

Scanner fuz= new Scanner(System.in);

System.out.print("How many numbers are there:");
n=fuz.nextInt();

System.out.print("enter the values");
for(i=0;i<n;i++)
arr[i]=fuz.nextInt();

//-------sorting
int tmp;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
if(arr[j]>arr[j+1])
{
tmp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=tmp;
}
}
System.out.print("Sorted array");
for(i=0;i<n;i++)
System.out.print(arr[i]+" ");

}

}