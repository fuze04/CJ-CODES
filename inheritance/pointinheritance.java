import java.util.*;
   class Point                                //------ definition / design
   {    int xco,yco;
                Scanner s = new Scanner(System.in); //---  not a data member 

   Point()                  //----- constructor overloading
       {
              xco= 9; yco =9; 
       }                    
   Point(int a, int b) 
       { 
               xco = a; yco = b; 
        }

     void getPt()
        {   
             xco=s.nextInt();
             yco=s.nextInt();
         }
      void showPt() 
         {
                 System.out.print(xco+" , "+ yco ); 
}
                 double distorig()
              { 
                        int a= xco*xco; int b = yco*yco;  
                        double c = Math.sqrt(a+b);
                        return(c);
               }


        int distBtw(Point t)
                 {   
                          int a,b,k;
                          a = (t.xco-xco) * (t.xco-xco);
                          b = (t.yco-yco) * (t.yco-yco);
                          k = (int) Math.sqrt(a+b);
                          return(k);
                   } 
   } //-------------------------------end of point

class Point3d extends Point
  {  int zco;
       Point3d() 
{
 zco=9; 
} 
       Point3d(int x, int y, int z)
 {
 super(x,y);  zco = z; 
} 

      void getPt() 
{
 super.getPt();
 zco = s.nextInt();
 }
      void showPt() 
{
 super.showPt(); 
System.out.println(" , "+zco); 
 }
    double dist3d() 
          {
 int a,b,c; 
            a = xco*xco ;
 b= yco * yco; 
c = zco * zco; 
            double d = Math.sqrt(a+b+c);
            return(d);
           }
   } //------------------------------- end of Point3d

   class pointinheritance
          {  

public static void main(String[] ans)
              {   

 Scanner x = new Scanner(System.in);   
                    int m,n,o; 
                   Point p2 = new Point(); 
                   Point q2 = new Point(23,36 ); 
                    System.out.println("\n The initial points :");
                    p2.showPt();
                     q2.showPt(); 
                   System.out.println(" \nEnter 2d points :");
                     p2.getPt();
                      q2.getPt();
                   System.out.println("The given 2d points are :");
                      p2.showPt(); 
                      q2.showPt(); 
     
                  Point3d p3 = new Point3d();
                 Point3d q3 = new Point3d(12,14,15);  //------------- static init
                     System.out.println(" \nThe initial points :");
                    p3.showPt();
                     q3.showPt(); 
                System.out.println("Enter initial coordinates");
                  m=  x.nextInt(); 
                   n= x.nextInt(); 
                   o = x.nextInt(); 
                  Point3d r3 = new Point3d( m,n,o); //--------  dynamic init 
               r3.showPt();
                

                  System.out.println(" Enter two 3d points :");
                  p3.getPt(); q3.getPt();
                  System.out.println(" The given points are :");
                  p3.showPt(); 
                 q3.showPt();
                   /*
                  int d1 = P2.dist3d();
                   System.out.println(" distance from origin to first point ="+d1);
                
                 int d2 = q2.dist3d();
                   System.out.println(" distance from origin to second point ="+d2);
                 */

              }
           }
 