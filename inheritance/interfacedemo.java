import java.util.*;

interface compute
{
double pi=3.14;
public double calci();

}

class circle implements compute
{
int rad;
void getdata(){rad=25;}
void showdata()
{
System.out.println("The radius="+rad);
}
public double calci()
{
return(rad*rad*pi);
}
}

class rectangle implements compute
{
int len,bre;
void getrect(){len=2;bre=10;}
void showrect(){System.out.println("The rectangle ="+len+"x"+bre);
}
public double calci()
{
return(len*bre);
}
}


class interfacedemo
{
public static void main(String[] fuz)
{
circle c=new circle();
rectangle r =new rectangle();

/*double k=c.calci();
System.out.println("The area of the circle is ="+k);
*/


/*k=r.calci();
System.out.println("The area of the =rectangle is ="+k);
*/

Scanner sc=new Scanner(System.in);
compute ir;
System.out.println("Enter 1 for circle and 2 for rectangle");
int ch=sc.nextInt();
if (ch==1){
c.getdata();
c.showdata();
ir=c;

}
else 
{
r.getrect();
r.showrect();
ir=r;

double d=ir.calci();

System.out.println("The area"+d);
}
}
}