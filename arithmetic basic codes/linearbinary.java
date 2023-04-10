import java.util.*;
public class linearbinary {

  public static void main(String[] args) {
      int n,i,lea=0,mos=0,flag=0,po=0,mid,pos=0,flg=0;
      int arr[]=new int[10];


    Scanner fuz= new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the values in sorted manner for binary search :");
    for (i=0;i<n;i++) {
      arr[i]=fuz.nextInt();
      
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        
      System.out.println(arr[i]);
      
    }
   



System.out.println("Enter your choice which search you want:");

System.out.println("press 1  for linear search");
System.out.println("press 2  for Binary search");
int ch=fuz.nextInt();

switch(ch)
{
case 1:
  System.out.print("Enter the element you want to search:\n");
int el=fuz.nextInt();

for (i=0;i<n;i++) 
{

if(el==arr[i])
po=i;
flag=1;
}   

if(flag==1)
{
  System.out.print("Element found at index position "+po);
}
else
{
System.out.print("Sorry element not found");
}

break;


case 2:

int beg=0,end=n;
 System.out.print("Enter the element you want to search:\n");
int ele=fuz.nextInt();
do
{

mid=(beg+end)/2;
if(arr[mid]>ele) end=mid-1; //----first half of array
else if(arr[mid]<ele) beg=mid+1; //------second half of array
else if(arr[mid]==ele) 
{pos=mid;
    
flg++;//------when arr[mid]==ele
break;
}

}
while(beg<=end);
if(flg==1)
{

System.out.print("Element found at index position "+pos);
}
else
{
System.out.print("Sorry element not found");
}


break;
}

  }//---end of public
}//---end of class

