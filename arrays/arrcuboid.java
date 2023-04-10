import java.util.*;

class Rect {
     
      Scanner ts= new Scanner(System.in);
   
 int l,b;  
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

class arrcuboid extends Rect
{
int hei;
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


public static void main(String[] sc)
{

int large=0,pos=0,small=100,p=0;

Scanner ts= new Scanner(System.in);
int k;
arrcuboid arrcub[]= new arrcuboid[10];


System.out.print("Enter the size of the array");
int n=ts.nextInt();


for(int i=0;i<n;i++)
{

arrcub[i]=new arrcuboid();

arrcub[i].getcub();
arrcub[i].showcub();
k=arrcub[i].vol();

System.out.print("\nThe volume of cuboid is ="+k+"\n");
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

}

System.out.print("\nThe largest volume is ="+large+" and the position is "+pos+"\n");
System.out.print("The smallest volume is ="+small+" and the position is "+p);

}//---end of main public

}//---end of class arrcuboid