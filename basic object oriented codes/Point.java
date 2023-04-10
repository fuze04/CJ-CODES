import java.util.*;

class Point{
 Point ptarr[]= new Point[10];
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  
 void getpt()    
{
   
     System.out.print("\nEnter the x co-ordinate ");
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

int diffbtw(Point p2)
{
  
  int a=(p2.xcrd-xcrd)*(p2.xcrd-xcrd);
  int b=(p2.ycrd-ycrd)*(p2.ycrd-ycrd);
  int e=(int)Math.sqrt(a+b);
  return(e);

}

public static void main(String[] args) {

    Point p1=new Point();
    Point p2=new Point();
System.out.println("-----------------------------------------------------------");

    p1.getpt();
    p1.showpt();
   int k =  p1.distorig();
  System.out.println("The distance from origin = "+ k);

    p2.getpt();
    p2.showpt();
   int r =  p2.distorig();
  System.out.println("The distance from origin = "+ r);


    if (k<r)
            System.out.print("The first distance co ordinate is near");
        else
            System.out.print("The Second distance Co ordinate is near\n");
      
int jts=p1.diffbtw(p2);
System.out.print("The Distance  between two is: "+jts);

}