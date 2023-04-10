import java.util.*;

class arrPoint{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  
 void getpt()    
{
   
     System.out.print("\nEnter the x co-ordinate");
     xcrd=fuz.nextInt();
     System.out.print("Enter the y co ordinate ");
     ycrd=fuz.nextInt();
System.out.println("-----------------------------------------------------------");
}

 void showpt()
{
    System.out.print("The  co ordinate is "+xcrd+","+ycrd+"\n");
   
System.out.println("-----------------------------------------------------------");
}

int distorig()
{
   int a = xcrd*xcrd;
   int b= ycrd*ycrd;
   int c= (int)Math.sqrt(a+b);
  return(c);
}

int diffbtw(arrPoint p2)
{
  
  int a=(p2.xcrd-xcrd)*(p2.xcrd-xcrd);
  int b=(p2.ycrd-ycrd)*(p2.ycrd-ycrd);
  int e=(int)Math.sqrt(a+b);
  return(e);

}

public static void main(String[] args) {
   



int k;

arrPoint ptarr[]= new arrPoint[10];
Scanner fuz= new Scanner(System.in);
System.out.print("Enter the size of the array");
int n=fuz.nextInt();

int near=100,far=0,pos=0,p=0;

for(int i=0;i<n;i++)
{

ptarr[i]=new arrPoint();

ptarr[i].getpt();
ptarr[i].showpt();

k=ptarr[i].distorig();
System.out.print("The distance from origin ="+k);

if(k>far)
{
    far=k;
    pos=i;
}
if(k<near)
{
    near=k;
    p=i;
}

}//---end of for loop
System.out.print("The farest distance from origin ="+far+" and the position is "+pos+"\n");
System.out.print("The nearest distance from origin ="+near+" and the position is "+p+"\n");
}//---end of main
}//---end of class