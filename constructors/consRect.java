import java.util.*;

class consRect {
     
      Scanner fuz= new Scanner(System.in);
   
 int l,b;  
 void showrect()
{
    System.out.print("The length of the rectangle is "+l+"\n");
    System.out.print("The breadth of the rectangle is "+b+"\n");

}

consRect(int x,int y)
{
l=x;
b=y;
}

int arearect()
{
   int area=l*b;
   return(area);
}

void perimeter()
{
int per;
per=2*(l*b);
System.out.println("The perimeter of the rectangle is"+per);

System.out.println("-----------------------------------------------------------");
}


public static void main(String[] args) {
   
Scanner fuz= new Scanner(System.in);
int a,b;
System.out.println(" Enter the length and breadth for the first rectangle ");
a=fuz.nextInt();
b=fuz.nextInt();

  
  consRect R1=new consRect(2,3);
    consRect R2=new consRect(a,b);
   
 
    R1.showrect();
   int comp= R1.arearect();
    System.out.println("The are of rectangle is:"+comp);
    R1.perimeter();



     
     R2.showrect();
     R2.arearect();
   int co= R2.arearect();
    System.out.println("The area of second rectangle is:"+co);
    R2.perimeter();
   

if(comp<co)
System.out.println("The area of first rectangle is less");
else
System.out.println("The area of second rectangle is less");

}
}