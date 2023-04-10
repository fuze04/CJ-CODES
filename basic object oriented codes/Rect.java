import java.util.*;

class Rect {

 
     
     
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

void perimeter()
{
int per;
per=2*(l*b);
System.out.println("The perimeter of the rectangle is"+per);

System.out.println("-----------------------------------------------------------");
}


public static void main(String[] args) {
   



  
  Rect R1=new Rect();
    Rect R2=new Rect();
   
    R1.getrect();
    R1.showrect();
   int comp= R1.arearect();
    System.out.println("The are of rectangle is:"+comp);
    R1.perimeter();



     R2.getrect();
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