import java.util.*;

class Point{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  

/*void getpt()    
{
   
     System.out.print("\nEnter the x co-ordinate: ");
     xcrd=fuz.nextInt();
     System.out.print("Enter the y co ordinate:");
     ycrd=fuz.nextInt();
}*/
 void showpt()
{
System.out.print("the  x coordinate y and z coordinates:");
    System.out.print(xcrd+","+ycrd);
   
}



int distorig()
{
   int a = xcrd*xcrd;
   int b= ycrd*ycrd;
  return (a+b);
}


}//-------------------end of 2d point

class Point3d extends Point
{

int zcrd;


void getpt3d()
{

getpt();
System.out.print("Enter the z co ordinate :");
zcrd=fuz.nextInt();
}

void showpt3d()
{

showpt();
System.out.print(","+zcrd);
}

int dist3d()
{
int d=zcrd*zcrd;
int f= (int)Math.sqrt(distorig()+d);
return(f);
}




public static void main(String[] args) {
   
Point3d  f1=new  Point3d();
Point3d f2=new Point3d();

f1.getpt3d();
f1.showpt3d();
int fuz=f1.dist3d();
System.out.println("\nThe distance from origin  for first 3dpoint is: "+fuz);

System.out.println("\n ENter the data for second 3d point");
f2.getpt3d();
f2.showpt3d();
int zub=f2.dist3d();
System.out.println("\nThe distance from origin  for second 3dpoint is: "+zub);
}

}//-end of point3d