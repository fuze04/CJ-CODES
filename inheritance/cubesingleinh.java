import java.util.*;

class Rect {
     
      Scanner ts= new Scanner(System.in);
   
 int l,b;  

Rect()
{
l=13;b=26;
}

/*Rect(int x,int y)
{

l=x;b=y;

}
*/
public void getrect()    
{
   
     System.out.println("Enter the length of the rectangle");
     l=ts.nextInt();
     System.out.println("Enter the breadth of the rectangle");
     b=ts.nextInt();
}


public void showrect()
{
    System.out.print("Length of the rectangle "+l+"x"+b);
 
}
int arearect()
{

int area=l*b;
return(area);
}
}//---end of rect

class cuboid extends Rect
{
int hei;
cuboid()
{
hei=17;
}

/*cuboid(int p1,int q1, int r1)
{
super(p1,q1);hei=r1;
}
*/
void getcub()
{
getrect();
System.out.println("Enter the height of the rectangle");
hei=ts.nextInt();
}

void showcub()
{
showrect();

System.out.print("x"+hei);
}

int vol()
{
return(arearect()*hei);
}

int sarea()
{
return(2*hei*(l+b));
}

}
class cubesingleinh
{


public static void main(String[] fuz)
{


cuboid c=new cuboid();
cuboid c0=new cuboid();
cuboid su1=new cuboid(1,2,3);


System.out.println("constructor overloading values for cuboid:");
su1.showcub();

System.out.println("\nEnter the cuboid dimension:");
c.getcub();
c.showcub();
int k=c.vol();
c0.showcub();

int over1=su1.vol();
System.out.println("\nThe volume for parameter initialization  is :"+over1);

int area=su1.sarea();
System.out.println("The surface area for parameter initialization is:"+area);




int p=c0.vol();
System.out.println("\nThe volume for static initalization is is :"+p);

int r=c0.sarea();
System.out.println("The surface area for static initialization is:"+r);





System.out.println("\nThe volume is :"+k);
k=c.sarea();
System.out.println("The surface area :"+k);
}

}