import java.util.*;

class consPoint{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  

consPoint(int sh,int fu)
{
xcrd=sh;
ycrd=fu;
}
 void showpt()
{
    System.out.print(xcrd+","+ycrd+"\n");
   
System.out.println("-----------------------------------------------------------");
}

int distorig()
{
   int a = xcrd*xcrd;
   int b= ycrd*ycrd;
   int c= (int)Math.sqrt(a+b);
  return(c);
}

int diffbtw(consPoint p2,consPoint p3)
{
 
  int a=(p2.xcrd-p3.xcrd)*(p2.xcrd-p3.xcrd);
  int b=(p2.ycrd-p3.ycrd)*(p2.ycrd-p3.ycrd);
  int e=(int)Math.sqrt(a+b);
  return(e);

}




public static void main(String[] args) {
   Scanner fuz= new Scanner(System.in);
int ab,cd;
System.out.print("Enterthe x coordinate and y coordinate");
ab=fuz.nextInt();
cd=fuz.nextInt();

consPoint p2=new consPoint(1,3);
consPoint p3=new consPoint(ab,cd);

System.out.println("The final inputs are: ");

System.out.print("the 1st x coordinate and y coordinate are:");
p2.showpt();
System.out.print("the 2nd x coordinate and y coordinate are:");
p3.showpt();

int k=p2.diffbtw(p2,p3);
System.out.println("The difference  between p and q is "+k);

}//---end of public
}//---end of main