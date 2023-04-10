import java.util.*;

class arrRect {

 
     
     
      Scanner fuz= new Scanner(System.in);
   
 int l,b;  
 void getrect()    
{
   
     System.out.print("Enter the length of the rectangle");
     l=fuz.nextInt();
     System.out.print("Enter the breadth of the rectangle");
     b=fuz.nextInt();
}


 void showrect()
{
    System.out.print("The length of the rectangle is "+l+"\n");
    System.out.print("The breadth of the rectangle is "+b+"\n");

}
int arearect()
{
   int area=l*b;
   return(area);
}

int perimeter()
{
int per;
per=2*(l*b);
return(per);
}


public static void main(String[] args) {


/*
arrRect r1= new arrRect();

r1.getrect();
r1.showrect();
*/



















   



int k,test;

arrRect recarr[]= new arrRect[10];
Scanner fuz= new Scanner(System.in);
System.out.print("Enter the size of the array");
int n=fuz.nextInt();

int large=0,pos=0,small=100,p=0;

for(int i=0;i<n;i++)
{

recarr[i]=new arrRect();//we are storing  length and breadth in single arr subscript

recarr[i].getrect();
recarr[i].showrect();

k=recarr[i].arearect();
test=recarr[i].perimeter();
System.out.print("The area of rectangle is ="+k+"\n");
System.out.print("The perimeter of rectangle is ="+test+"\n");

if(k>large)
{
large=k;
pos=i;
}

if(k<small)
{
small=k;
p=i;
}
}//----ending of for loop 
System.out.print("\nThe largest area of rectangle is ="+large+" and the position is "+pos+"\n");
System.out.print("The smallest area of rectangle is ="+small+" and the position is "+p);

}//----ending of main
}//----ending of class