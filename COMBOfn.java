import java.util.*;
//import geometry.*;
import java.io.*;
class COMBOfn {
    public static void main(String[] pwd) {

        int ch;
        Scanner fuz = new Scanner(System.in);
       System.out.println("----------------------WELCOME TO THE WORLD OF JAVA ------------------------\n \t             PROGRAMED BY FUZAIL");
       System.out.println("Press 1: basic & Arithmetic codes");
        System.out.println("Press 2: basic object oriented codes ");
        System.out.println("Press 3: Array Codes");
        System.out.println("Press 4: Constructor Codes");
        System.out.println("Press 5: All inheritance Codes");
        System.out.println("Press 6: String codes");
        System.out.println("Press 7: Vector Codes");
        System.out.println("Press 8: Streams");
        System.out.println("Press 9: Threading codes");
	  System.out.println("Press 10: Package code");
        ch = fuz.nextInt();

        switch(ch) {
            case 1:
System.out.println("\tGreat!!! You Have Chosen Basic & Arithmetic codes\n");
	  System.out.println("Press 1: For sum of two numbers");
        System.out.println("Press 2: For square root of a number");
        System.out.println("Press 3: For finding the greatest number among three");
        System.out.println("Press 4: For finding GCD and LCM of two numbers");
        System.out.println("Press 5: For printing fibonacci series");
        System.out.println("Press 6: For checking if a number is prime or not");
        System.out.println("Press 7: For sorting an array");
        System.out.println("Press 8: To Get table of any number");
        System.out.println("Press 9: To use linear and binary methods");
        System.out.print("Enter your choice: ");
	  int art=fuz.nextInt(); 
				switch(art)
					{
						case 1:
							addNumbers(fuz);
							break;
						case 2:
							findsquareroot(fuz);
							break;
						case 3:
							
							greatestofthree(fuz);
							break;
						case 4:
							gcdlcd(fuz);
							break;
						case 5:
							fibonacci(fuz);
							break;
						case 6:
							prime( fuz);
							break;
						case 7:
							sorting( fuz);
							break;
						case 8:
							table(fuz);
							break;
						case 9:

							linearbinary(fuz);
							break;
									
				default:
                System.out.println("Invalid choice!");
							break;
						
												
						
		}//-----end of switch art	
                

                break;
                
            case 2:
System.out.println("\tGreat!!! You Have Chosen basic object oriented codes\n");
	  System.out.println("Press 1: to get 2darray");
        System.out.println("Press 2: Distance code");
        System.out.println("Press 3: To use complex code");
        System.out.println("Press 4: point code");
        System.out.println("Press 5: 3d point code");
        System.out.println("Press 6: rectangle code");

int chopp=fuz.nextInt();
switch(chopp)
{

case 1:

									matrix m1=new matrix();//---1st matrix
			  						matrix m2=new matrix();//---2nd matrix
			  						matrix m3=new matrix();//---addition  matrix
			 		 
                                System.out.print("Enter the row and column  size of the array:");
                                m1.getrow();

   						 System.out.print("Enter the values in the array:");
  						 m1.getvalue();
   					 System.out.print("Displaying the array\n");
     						 m1.showmat();


						System.out.print("Enter the row and column  size of the 2nd  array:");
  						 m2.getrow();

    						System.out.print("Enter the values in the array:");
  						 m2.getvalue();
   							 System.out.print("Displaying the array\n");
      							m2.showmat();
                 



                                          int charr;
							System.out.print("what operation u want to do:");
							System.out.println(" press 1 for addition");
							System.out.println(" press 2 for subtraction");
							System.out.println(" press 3 for multiplication");
                                          charr=fuz.nextInt();


  switch(charr)
{
case 1:
System.out.print(" Addition of the matrix\n");
m3=m1.addmat(m2);
m3.addmat(m2);
break;
case 2:
System.out.print(" Subrtraction of the matrix\n");
m3=m1.submat(m2);
m3.submat(m2);
break;
case 3:
System.out.print(" Multiplication  of the matrix\n");
m3=m1.multmat(m2);
m3.multmat(m2);
break;
default:
System.out.println("Invalid choice!");

  }//---end of charr switch
                  break;
              case 2:


Distance d1 = new Distance();
    Distance d2 = new Distance();
    Distance d3=  new Distance();
System.out.println("-----------------------------------------------------------");

    System.out.print("Enter the 1st Distance");
       d1.getdist();
System.out.print("The 1st Distance  is:-");
       d1.showdist();
   
System.out.print("Enter the 2nd Distance");
d2.getdist();
System.out.print("The 2nd Distance is:-");
d2.showdist();

System.out.print("The addition of two distance is:-");
d3=d1.addDist(d2);
d3.showdist();

break;

case 3:
 Complex C1 = new Complex();//---getcomp
    Complex C2 = new Complex();//---2nd complex
    Complex C3 = new Complex();//---addcomp
  
    

System.out.println("-----------------------------------------------------------");

    System.out.print("Enter the 1st Complex number");
       C1.getcomp();
System.out.print("The 1st Complex number is:-");
       C1.showcomp();
   
System.out.print("Enter the 2nd Complex number");
C2.getcomp();
System.out.print("The 2nd Complex number is:-");
C2.showcomp();

System.out.print("The Addition of two Complex number is:-");
C3=C1.addreal(C2);
C3.showcomp();

System.out.print("The Subtraction of two Complex number is:\n");
C3=C1.subcomp(C2);
C3.showcomp();

System.out.print("The Multiplication of two Complex number is:\n");
C3=C1.multcomp(C2);
C3.showcomp();

break;
case 4:
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
break;
case 5:

Point3d  f1=new  Point3d();
Point3d f2=new Point3d();

f1.getpt3d();
f1.showpt3d();
 int va=f1.dist3d();
System.out.println("\nThe distance from origin  for first 3dpoint is: "+va);

System.out.println("\n ENter the data for second 3d point");
f2.getpt3d();
f2.showpt3d();
int zub=f2.dist3d();
System.out.println("\nThe distance from origin  for second 3dpoint is: "+zub);

break;
case 6:
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

break;
default:
System.out.println("invalid choice");

}
break;


case 3:
                
System.out.println("\tGreat!!! You Have Chosen Array Codes\n");

	  System.out.println("Press 1:  normal 1darray");
        System.out.println("Press 2: Array of cuboid");
        System.out.println("Press 3: Array of point");
        System.out.println("Press 4: Array of rectangle");
        System.out.println("Press 5: pure Two Dimensional array & transpose of matrix  ");
int arrays=fuz.nextInt();

switch(arrays)
{
case 1:
array(fuz);
break;
case 2:


int large=0,pos=0,small=100,p=0;


int k;
arrcuboid arrcub[]= new arrcuboid[10];


System.out.print("Enter the size of the array");
int n=fuz.nextInt();


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

break;
case 3:

int ks;

arrPoint ptarr[]= new arrPoint[10];
System.out.print("Enter the size of the array");
int nu=fuz.nextInt();

int near=100,far=0;
pos=0;
p=0;

for(int i=0;i<nu;i++)
{

ptarr[i]=new arrPoint();

ptarr[i].getpt();
ptarr[i].showpt();

ks=ptarr[i].distorig();
System.out.print("The distance from origin ="+ks);

if(ks>far)
{
    far=ks;
    pos=i;
}
if(ks<near)
{
    near=ks;
    p=i;
}

}//---end of for loop
System.out.print("The farest distance from origin ="+far+" and the position is "+pos+"\n");
System.out.print("The nearest distance from origin ="+near+" and the position is "+p+"\n");

break;
case 4:

int test;
int kms;
arrRect recarr[]= new arrRect[10];
System.out.print("Enter the size of the array");
int num=fuz.nextInt();

 large=0;pos=0;
small=100;p=0;

for(int i=0;i<num;i++)
{

recarr[i]=new arrRect();//we are storing  length and breadth in single arr subscript

recarr[i].getrect();
recarr[i].showrect();

kms=recarr[i].arearect();
test=recarr[i].perimeter();
System.out.print("The area of rectangle is ="+kms+"\n");
System.out.print("The perimeter of rectangle is ="+test+"\n");

if(kms>large)
{
large=kms;
pos=i;
}

if(kms<small)
{
small=kms;
p=i;
}
}//----ending of for loop 
System.out.print("\nThe largest area of rectangle is ="+large+" and the position is "+pos+"\n");
System.out.print("The smallest area of rectangle is ="+small+" and the position is "+p);


break;
case 5:
transarray(fuz);
break;
default:
System.out.println("Invalid input");



}                

			break;
            case 4:
                 System.out.println("\tGreat!!! You Have Chosen Constructors\n");

							System.out.println(" press 1 To see the use of constructor in complex program");
							System.out.println(" press 2 To see the use of constructor overloading in point program ");
							System.out.println(" press 3 To see the use of constructor in rectangle program");
int connst= fuz.nextInt();


switch(connst)
{

case 1:

int a,b;
System.out.println("Enter the real and imaginary number: ");
a=fuz.nextInt();
b=fuz.nextInt();

  consComplex c2= new consComplex(2,4);
  consComplex c3= new consComplex(a,b);

  
  System.out.println("The final inputs are: ");
 
  c2.showNum();
  c3.showNum();
 
  //----displaying addition
  consComplex temp=c2.add(c3);
  System.out.println("The Addition is= "+temp.real+" + "+ temp.img+"i");

break;
case 2:

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

int kcs=p2.diffbtw(p2,p3);
System.out.println("The difference  between p and q is "+kcs);


break;
case 3:

int a1,b1;
System.out.println(" Enter the length and breadth for the first rectangle ");
a1=fuz.nextInt();
b1=fuz.nextInt();

  
  consRect R1=new consRect(2,3);
    consRect R2=new consRect(a1,b1);
   
 
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

break;
default:
System.out.println("Invalid input");

}


                 break;

		case 5:
		      System.out.println("\tGreat!!! You Have Chosen Inheritance\n");
	  System.out.println("Press 1: to see use of single level inheritance");
        System.out.println("Press 2: to see use of multi-level inheritance");
        System.out.println("Press 3: to see use of point 3d inheriting point 2d");
        System.out.println("Press 4: to see use of heirarchial  inheritance");
        System.out.println("Press 5: to see use of abstraction");
        System.out.println("Press 6: to see use of interface");
int inheri=fuz.nextInt();

switch(inheri)
{

case 1:

cuboid c=new cuboid();
cuboid c0=new cuboid();
cuboid su1=new cuboid(1,2,3);


System.out.println("constructor overloading values for cuboid:");
su1.showcub();

System.out.println("\nEnter the cuboid dimension:");
c.getcub();
c.showcub();
int kins=c.vol();
c0.showcub();

int over1=su1.vol();
System.out.println("\nThe volume for parameter initialization  is :"+over1);

int area=su1.sarea();
System.out.println("The surface area for parameter initialization is:"+area);




int py=c0.vol();
System.out.println("\nThe volume for static initalization is is :"+py);

int rs=c0.sarea();
System.out.println("The surface area for static initialization is:"+rs);





System.out.println("\nThe volume is :"+kins);
kins=c.sarea();
System.out.println("The surface area :"+kins);


break;
case 2:

Mtime m = new Mtime();
             Stime s = new Stime();
             Time t = new Time();
            int k; 

          



          System.out.println(" \noperations with Time object....\n");
              t.getTime();
              t.showTime();
            k = t.convert();
            System.out.println(" The time in minutes = "+ k); 


             
          System.out.println(" \noperations with Stime object....\n");
              s.getTime();
              s.showTime();
                 k = s.convert();
           System.out.println(" The time in seconds = "+ k);  


  
              System.out.println(" operations with Mtime object....");
              m.getTime();
              m.showTime();
            k = m.convert();
           System.out.println(" The time in milli sec.s  = "+ k);

break;
case 3:

int m1,n,o; 
                   Pointinh p2 = new Pointinh(); 
                   Pointinh q2 = new Pointinh(23,36 ); 
                    System.out.println("\n The initial points :");
                    p2.showPt();
                     q2.showPt(); 
                   System.out.println(" \nEnter 2d points :");
                     p2.getPt();
                      q2.getPt();
                   System.out.println("The given 2d points are :");
                      p2.showPt(); 
                      q2.showPt(); 
     
                  Point3dinh p3 = new Point3dinh();
                 Point3dinh q3 = new Point3dinh(12,14,15);  //------------- static init
                     System.out.println(" \nThe initial points :");
                    p3.showPt();
                     q3.showPt(); 
                System.out.println("Enter initial coordinates");
                  m1=  fuz.nextInt(); 
                   n= fuz.nextInt(); 
                   o = fuz.nextInt(); 
                  Point3dinh r3 = new Point3dinh( m1,n,o); //--------  dynamic init 
               r3.showPt();
                

                  System.out.println(" Enter two 3d points :");
                  p3.getPt(); q3.getPt();
                  System.out.println(" The given points are :");
                  p3.showPt(); 
                 q3.showPt();

break;
case 4:

Manager ml = new Manager();
    Employee e1=new Employee();
    Person  p1=new Person();
p1.getInfo();
e1.getInfo();
  ml.getInfo();
    p1.showInfo();
    e1.showInfo();
    ml.showInfo();




break;
case 5:

Shape3 obj= new Shape3();
	   obj.circle();
	   obj.square();
	   obj.rectangle();
	   obj.triangle();

break;
case 6:

circle c1=new circle();
rectangle r =new rectangle();
System.out.println("How you want to execute this code \n 1.default calling method\n 2.using dynamic dipatch ");
int dyr=fuz.nextInt();
switch(dyr)
{
case 1:
double kng=c1.calci();
System.out.println("The area of the circle is ="+kng);
kng=r.calci();
System.out.println("The area of the =rectangle is ="+kng);
break;
case 2:

compute ir;
System.out.println("Enter 1 for circle and 2 for rectangle");
int dy=fuz.nextInt();
if (dy==1){
c1.getdata();
c1.showdata();
ir=c1;

}
else 
{
r.getrect();
r.showrect();
ir=r;

double d=ir.calci();

System.out.println("The area"+d);
}
break;
default:
System.out.println("Invalid input");
}


break;
default:
System.out.println("Invalid input");


}
		     break;
            case 6:
 System.out.println("\tGreat!!! You Have Chosen Strings\n");
	  System.out.println("Press 1: demo of strings");
        System.out.println("Press 2: demo of wrap");
        System.out.println("Press 3: ------------incomplete");
        System.out.println("Press 4: ------------incomplete");
int str=fuz.nextInt();
switch(str)
{

case 1:
string(fuz);
break;
case 2:
wrap(fuz);
break;
case 3:
break;
case 4:
break;
default:
System.out.println("invalid input");

}




		     break;

		case 7:
 System.out.println("\tGreat!!! You Have Chosen Vectors\n");
	  System.out.println("Press 1: vectors");
        System.out.println("Press 2: ------------incomplete");
        System.out.println("Press 3: ------------incomplete");
        System.out.println("Press 4: ------------incomplete");
int vectors=fuz.nextInt();
switch(vectors)
{

case 1:
vectordemo();
break;
case 2:

break;
case 3:
break;
case 4:
break;
default:
System.out.println("invalid input");

}

		     
		     break;
		case 8:
			 System.out.println("\tGreat!!! You Have Chosen Streams\n");

//fileprim();


 		      break;
            case 9:
 System.out.println("\tGreat!!! You Have Chosen threading\n");
System.out.println("Press 1: To use Multithreading codes");
int ther=fuz.nextInt();
switch(ther)
{
case 1:
Fibo f=new Fibo();
Multitab m=new Multitab();
print p=new print();
square s=new square();
f.start();
m.start();
p.start();
s.start();

break;
case 2:
break;
default:
System.out.println("Invalid choice");

}
                 break;
case 10:
System.out.println("\tGreat!!! You Have Chosen Packages\n");
System.out.println("NOTE: BEFORE RUNNING MAKE SURE U DID THE FOLLOWING STEPS\n1.Make one directory into your folder with geometry name\n2.copy the below codes into the geometry Directory in two different file with different names as per your class name\n3.Go to your geometry directory and compile both the codes NOTE : DON'T EXECUTE THE CODES\n4. Come back to this code and press-1");

System.out.println("First code:\npackage geometry;\npublic class geoCircle\n{\nint rad;\npublic void showgeocircle()\n{\nSystem.out.println(This is the circle in my package);\n}\n} ");



System.out.println("Second Code:\npackage geometry;\npublic class geoRect\n{\nint l,b;\npublic void showgeorect()\n{\nSystem.out.println(This is the rectangle in my package);\n}\n}");

System.out.println("After completing This come to Line 823 and also for line no.2 and remove coments and then execute this code");
System.out.println("Press 1: To get the Demonstration of packages ");
int pck=fuz.nextInt();
switch(pck)
{
case 1:
/*
geoRect gr=new geoRect();
       gr.showgeorect();
       geoCircle gc=new geoCircle();
       gc.showgeocircle();*/
break;
case 2:
break;
default:
System.out.println("Invalid input");
}

break;
		default:
			System.out.println("Invalid choice");  

}//----end of switch ch

}//-----end of public main

public static void addNumbers(Scanner fuz){
                    int num1, num2, sum;
                System.out.println("Enter the 2 numbers:");
                num1 = fuz.nextInt();
                num2 = fuz.nextInt();

                sum = num1 + num2;

                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is " + sum);
}



public static void findsquareroot(Scanner fuz){
                int num;
                double res;
                System.out.println("Enter a Number to find Square Root : ");
                num = fuz.nextInt();
                res = Math.sqrt(num);
                System.out.println("Result : " + res);

}

public static void greatestofthree(Scanner fuz){

 int no1, no2, no3, greatest=0;

                System.out.println("Enter Number 1: ");
                no1 = fuz.nextInt();
                System.out.println("Enter Number 2: ");
                no2 = fuz.nextInt();
                System.out.println("Enter Number 3: ");
                no3 = fuz.nextInt();

                greatest = no1;
                if (no2 > greatest)
                    greatest = no2;
                if (no3 > greatest)
                    greatest = no3;

                System.out.println("\nThe greatest number is: " + greatest);
                

}


public static void gcdlcd(Scanner fuz){

int n1, n2, gcd, lcm;

                        System.out.println("Enter value for n1: ");
                        n1 = fuz.nextInt();
                        System.out.println("Enter value for n2: ");
                        n2 = fuz.nextInt();

                        // initialization
                        gcd = 1;
                        lcm = (n1 > n2) ? n1 : n2;

                        // GCD
                        for (int i = 1; i <= n1 && i <= n2; ++i) {
                            if (n1 % i == 0 && n2 % i == 0)
                                gcd = i;
                        }

                        // LCM
                        while (true) {
                            if (lcm % n1 == 0 && lcm % n2 == 0)
                                break;
                            ++lcm;
}

        // gcd = (n1 * n2) / lcm;
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  
}






public static void fibonacci(Scanner fuz){

int i = 1, n , nth1 = 0, nth2 = 1;
    System.out.print("Enter the nth term");
    n=fuz.nextInt();

    while (i <= n) {
      System.out.print(nth1 + ", ");

      int nth3 = nth1 + nth2;
      nth1 = nth2;
      nth2 = nth3;

      i++;
    }

}


public static void prime(Scanner fuz)
{
int rem,flag=0;
int n,i;
System.out.print("Enter the Number to check whether it is prime or not:");
    
    n=fuz.nextInt();
    

    for (i=2;i<n;i++) {
      rem=n%i;
      // condition for nonprime number
      if (rem == 0) {
         flag = 1;
        break;
      }
    }

    if (flag==0)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");


}



public static void sorting(Scanner fuz){

int arr[]=new int[10];
int j,lea,pos;
int n,i;
System.out.print("How many numbers are there:");
n=fuz.nextInt();

System.out.print("enter the values");
for(i=0;i<n;i++)
arr[i]=fuz.nextInt();

//-------sorting
int tmp;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
if(arr[j]>arr[j+1])
{
tmp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=tmp;
}
}
System.out.print("Sorted array");
for(i=0;i<n;i++)
System.out.print(arr[i]+" ");


}



public static void table(Scanner fuz){
int r,i,n,x,m;
System.out.print("Enter the table number which you want:");
r=fuz.nextInt();

System.out.print("Enter the the nth number of the table :");
n=fuz.nextInt();

for(i=1;i<=n;i++)
{
x=r*i;
System.out.println(r+"x"+i+"="+x);
}
}//end of method






 public static class matrix {

int n,i,j,m,p,q,k;
      int arr[][]=new int[10][10];
      int addarr[][]=new int[10][10];
   Scanner fuz= new Scanner(System.in);
void getrow()
{ 
 n=fuz.nextInt();
 m=fuz.nextInt();
}


void getvalue()
{

 for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
      arr[i][j]=fuz.nextInt();
        }
    }

}//---end of func



void showmat()
{

 for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
        
      System.out.print(arr[i][j]+"  ");
    }
      System.out.println();
    
    }

}



matrix addmat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

temp.addarr[i][j]=arr[i][j]+m2.arr[i][j];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of addmat





matrix submat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

temp.addarr[i][j]=arr[i][j]-m2.arr[i][j];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of submat







matrix multmat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m2.m;j++)
{addarr[i][j]=0;
for(k=0;k<m;k++)
{
temp.addarr[i][j]+=arr[i][k]*m2.arr[k][j];
}
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m2.m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of submat

}//---end of class
//}//---end of arrmethod

public static void linearbinary(Scanner fuz) {
      int n,i,lea=0,mos=0,flag=0,po=0,mid,pos=0,flg=0;
      int arr[]=new int[10];


   // Scanner fuz= new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the values in sorted manner for binary search :");
    for (i=0;i<n;i++) {
      arr[i]=fuz.nextInt();
      
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        
      System.out.println(arr[i]);
      
    }
   



System.out.println("Enter your choice which search you want:");

System.out.println("press 1  for linear search");
System.out.println("press 2  for Binary search");
int ch=fuz.nextInt();

switch(ch)
{
case 1:
  System.out.print("Enter the element you want to search:\n");
int el=fuz.nextInt();

for (i=0;i<n;i++) 
{

if(el==arr[i])
po=i;
flag=1;
}   

if(flag==1)
{
  System.out.print("Element found at index position "+po);
}
else
{
System.out.print("Sorry element not found");
}

break;


case 2:

int beg=0,end=n;
 System.out.print("Enter the element you want to search:\n");
int ele=fuz.nextInt();
do
{

mid=(beg+end)/2;
if(arr[mid]>ele) end=mid-1; //----first half of array
else if(arr[mid]<ele) beg=mid+1; //------second half of array
else if(arr[mid]==ele) 
{pos=mid;
    
flg++;//------when arr[mid]==ele
break;
}

}
while(beg<=end);
if(flg==1)
{

System.out.print("Element found at index position "+pos);
}
else
{
System.out.print("Sorry element not found");
}


break;
}

  }//---end of public linear binary



public static class Distance{
 
      Scanner fuz= new Scanner(System.in);
   
 int feet;
 int inch;
 
 void getdist()    
{  
     inch=fuz.nextInt();
     feet=fuz.nextInt();
}

 void showdist()
{
    System.out.print(inch+"'"+feet+"\n");
   
System.out.println("-----------------------------------------------------------");
}

Distance addDist(Distance d2)
{
Distance temp =new Distance();

 temp.inch=inch+d2.inch;
  temp.feet=feet+d2.feet;

  if(temp.inch >=12)
{        
         temp.feet++;
         temp.inch=temp.inch-12;
         
}
return(temp);
}

}//----end of class distance


public static class Complex{
 
      Scanner fuz= new Scanner(System.in);
   
 int real;
 int img;
 
 void getcomp()    
{  
     real=fuz.nextInt();
     img=fuz.nextInt();
}



 void showcomp()
{
    System.out.print(real+"+"+img+"i\n");
   
System.out.println("-----------------------------------------------------------");
}

Complex addreal(Complex C2)
{
   Complex temp =new Complex();
  temp.real=real+C2.real;
  temp.img=img+C2.img;
  return(temp);
}

Complex subcomp(Complex C2)
{
   Complex temp =new Complex();
  temp.real=real-C2.real;
  temp.img=img-C2.img;
  return(temp);
}
Complex multcomp(Complex C2)
{
   Complex temp =new Complex();
  temp.real=real*C2.real;
  temp.img=img*C2.img;
  return(temp);
}

}//----end of class complex



public static class Point{
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

}//---end of Point class



public static class Point2d{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  

void getpt()    
{
   
     System.out.print("\nEnter the x co-ordinate: ");
     xcrd=fuz.nextInt();
     System.out.print("Enter the y co ordinate:");
     ycrd=fuz.nextInt();
}
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

public static class Point3d extends Point2d
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

}//----end of 3d point



public static class Rect {

 
     
     
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

}//----end of rect



public static void array(Scanner fuz){
int n,i,lea=0,mos=0;
      int arr[]=new int[10];

    
    System.out.print("Enter the size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the values in the array:");
    for (i=0;i<n;i++) {
      arr[i]=fuz.nextInt();
      
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        
      System.out.println(arr[i]);
      
    }
    
    lea=arr[0];
     for (i=0;i<n;i++) {
         if(arr[i]<lea)
         lea=arr[i];
         
      
    }
    mos=arr[0];
    for (i=0;i<n;i++) {
      if(arr[i]>mos)
      {
      mos=arr[i];
      }
      
    }
    
    System.out.println("the range of the array is from"+lea +"to "+mos);
    
}//---end of array method



public static class Rectarr {
     
      Scanner fuz= new Scanner(System.in);
   
 int l,b;  
public void getrect()    
{
   
     System.out.println("Enter the length of the rectangle");
     l=fuz.nextInt();
     System.out.println("Enter the breadth of the rectangle");
     b=fuz.nextInt();
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

public static class arrcuboid extends Rectarr
{
int hei;
void getcub()
{
getrect();
System.out.println("Enter the height of the rectangle");
hei=fuz.nextInt();
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

}//---end of class cuboid



public static class arrPoint{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  
 void getpt()    
{
   
     System.out.print("\nEnter the x co-ordinate");
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

int diffbtw(arrPoint p2)
{
  
  int a=(p2.xcrd-xcrd)*(p2.xcrd-xcrd);
  int b=(p2.ycrd-ycrd)*(p2.ycrd-ycrd);
  int e=(int)Math.sqrt(a+b);
  return(e);

}
}//----end of class arrpoint




public static class arrRect {

 
     
     
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

}//---end of class arrRect

public static void transarray(Scanner fuz) {
      int n,i,j,m;
      int arr[][]=new int[10][10];

    
    System.out.print("Enter the row size of the array:");
    n=fuz.nextInt();
    
    System.out.print("Enter the coloumn size of the array:");
    m=fuz.nextInt();
    
    System.out.print("Enter the values in the array:");
    for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
      arr[i][j]=fuz.nextInt();
        }
    }
    System.out.print("Displaying the array\n");
    for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
        
      System.out.print(arr[i][j]+"  ");
    }
      System.out.println();
    
    }
       System.out.print("Displaying the Transpose of the  array\n");
 for (i=0;i<m;i++) {
        for(j=0;j<n;j++)
        {

             System.out.print(arr[j][i]+" ");

     }//---end of j loop
System.out.println();
  }//---end of i loop
}//----end of method





public static class consComplex       //-------design part
{ Scanner fuz=new Scanner(System.in);
  int real, img;     //-----initialization




 consComplex()
{
System.out.println("Constructor created");
}
consComplex(int x, int y) 
{
 real=x; img=y;
 }

  void showNum(){
  System.out.println("The complex no = "+real+" + "+img+"i"); }

 
  consComplex add(consComplex c3 ) //---function for addition
  {
  consComplex temp = new consComplex();
 
  temp.real=real+c3.real;
  temp.img=img+c3.img;
  return(temp);  //----returning the addition of complex nos
  }
}//----end of class complex


public static class consPoint{
 
      Scanner fuz= new Scanner(System.in);
   
 int xcrd;
 int ycrd;  


 void showpt()
{
    System.out.print(xcrd+","+ycrd+"\n");
   
System.out.println("-----------------------------------------------------------");
}
consPoint(int sh,int fu)

{

xcrd=sh;
ycrd=fu;

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

}//---end of class conspoint

public static class consRect {

 
     
     
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
}//---end of class consrect


public static class Rectinh {
     
      Scanner fuz= new Scanner(System.in);
   
 int l,b;  

Rectinh()
{
l=13;b=26;
}

Rectinh(int x,int y)
{

l=x;b=y;

}

public void getrect()    
{
   
     System.out.println("Enter the length of the rectangle");
     l=fuz.nextInt();
     System.out.println("Enter the breadth of the rectangle");
     b=fuz.nextInt();
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

public static class cuboid extends Rectinh
{
int hei;
cuboid()
{
hei=17;
}

cuboid(int p1,int q1, int r1)
{
super(p1,q1);hei=r1;
}

void getcub()
{
getrect();
System.out.println("Enter the height of the rectangle");
hei=fuz.nextInt();
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

}//----end of class 

public static class Time 
    {   int hr,min; 
               Scanner fuz=new Scanner(System.in);
        void getTime() 
          { 
              hr = fuz.nextInt();
              min = fuz.nextInt();  
          }
         void showTime() 
          { 
              System.out.print(hr+":"+min);
          }
        
         int convert() 
             {
               return(hr*60+min ); 
             }   

    } //----------------------------------------
     
  public static class Stime extends Time
   {   int sec;
        
        void getTime()
            { 
               super.getTime(); 
               sec = fuz.nextInt(); 
            }
         void showTime()
         { 
             super.showTime(); 
             System.out.print(" :"+ sec);
         }
        int convert() 
         { int x=super.convert(); 
           x = x*60+sec;
           return(x);
         }
    
    }  //-----------------------------------------
  
  public static class Mtime extends Stime
    {  int msec; 
          void getTime()
           {
            super.getTime(); 
            msec =fuz.nextInt(); 
           }
         void showTime() 
          {  
            super.showTime(); 
            System.out.println(" :"+msec);
         }
         int convert()
         {  
            int x=super.convert(); 
            x = x*60+sec;
            return(x);
        }
       
    }//-------------end of class




public static class Pointinh                                //------ definition / design
   {    int xco,yco;
                Scanner fuz = new Scanner(System.in); //---  not a data member 

   Pointinh()                  //----- constructor overloading
       {
              xco= 9; yco =9; 
       }                    
   Pointinh(int a, int b) 
       { 
               xco = a; yco = b; 
        }

     void getPt()
        {   
             xco=fuz.nextInt();
             yco=fuz.nextInt();
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


        int distBtw(Pointinh t)
                 {   
                          int a,b,k;
                          a = (t.xco-xco) * (t.xco-xco);
                          b = (t.yco-yco) * (t.yco-yco);
                          k = (int) Math.sqrt(a+b);
                          return(k);
                   } 
   } //-------------------------------end of point

public static class Point3dinh extends Pointinh
  {  int zco;
       Point3dinh() 
{
 zco=9; 
} 
       Point3dinh(int x, int y, int z)
 {
 super(x,y);  zco = z; 
} 

      void getPt() 
{
 super.getPt();
 zco = fuz.nextInt();
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
   } //------------------------------- end of Point3dinh



public static class Person {
  long mob;
  int age;
  long adhr;
  Scanner fuz = new Scanner(System.in);
String s=new String();
  void getInfo() {
    System.out.println("Enter Name");
    s=fuz.nextLine();
    System.out.println("Enter your Age");
    age = fuz.nextInt();
    System.out.println("Enter your adhaar number");
    adhr = fuz.nextLong();
    System.out.println("Enter your Mobile number number");
    mob = fuz.nextLong();
    
  }

  void showInfo() {
    System.out.println("\t  INFO\n");
    System.out.println("Name:-"+s+"\n"+"Age:-" + age + "\n" + "Adhar no.-" + adhr + "\n" + "Mobile number:-" + mob+"\n");
  }

} // ---end of person class

public static class Employee extends Person {

  int emp_id;
  int branch_n0;
   int salary;
void getInfo() {
super.getInfo();
    System.out.println("Enter the employee ID");
    emp_id = fuz.nextInt();
    
    System.out.println("Enter the branch number");
    branch_n0 = fuz.nextInt();
    
    System.out.println("Enter the salary");
    salary = fuz.nextInt();


  }

  void showInfo() {
System.out.println(   "employee-------");
super.showInfo();

    System.out.println("Employee ID: " + emp_id + "\n"  + "\n" + "Branch number: " + branch_n0+"Salary:-"+salary+"\n");
  }
} // ---end of employee class

public static class Manager extends Person {

  int x,tot,salary;
  void getInfo() {
super.getInfo();
System.out.println("Enter the salary");
    salary = fuz.nextInt();
    System.out.println("Enter the no of tsks completed this month:");
    x = fuz.nextInt();
    tot = x * salary;
  }

  void showInfo() {
System.out.println("manager-----");
super.showInfo();
    System.out.println("The salary of the manager is: " + tot);
  }
} // ---end of manager class


public static abstract class Shape1                      //---Abstract class
{ 
	public void circle()        
	{
	  System.out.println("The shape is a circle");
	}
	public abstract void square();       //---Abstract methods
	public abstract void rectangle();
	public abstract void triangle();
}

 public static abstract class Shape2 extends Shape1
{ 
	public void square()        
	{
	  System.out.println("The shape is a square");
	}

}

public static class Shape3 extends Shape2		     //---Concrete
{
	public void rectangle()        
	{
	  System.out.println("The shape is a rectangle");
	}
	public void triangle()        
	{
	  System.out.println("The shape is a triangle");
	}
}//---end of class


public static interface compute
{
double pi=3.14;
public double calci();

}

public static class circle implements compute
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

public static class rectangle implements compute
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


public static void string(Scanner fuz)
{int i,n;
//Scanner fuz=new Scanner(System.in);
       	   


int k;



String w1=new String("andrews");
String w2=new String("college");

k=w1.length();
System.out.println("The length of "+w1+"="+k);

k=w2.length();
System.out.println("The length of "+w2+"="+k);


k=w1.compareTo(w2);
System.out.println("compare the two words:"+k);

System.out.println("Arethey equal?"+w1.equals(w2));

System.out.println("Arethey equal?"+w1.equals(w2));
System.out.println("Arethey equal?"+w1.equalsIgnoreCase(w2));

System.out.println("Combined word:"+w1.concat(w2));

 n=w2.length();
for( i=0;i<n;i++){
System.out.println(w2.charAt(i));
}
System.out.print(w2.substring(4));
System.out.print(w2.substring(2,4));
System.out.println(w2.indexOf('o'));

}//----end of method string



public static void wrap(Scanner fuz) {
 System.out.println("Enter any number");
        int n=fuz.nextInt(); // set the input value here

        int flg = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flg++;
                break;
            }
        }

        if (flg != 0) {
            System.out.println("It is a Composite Number");
        } else {
            System.out.println("It is a Prime Number");
        }
    
}






public static class Fibo extends Thread
{
public void run()
{
int i,f=0,s=1,temp;
System.out.println(f+"\n"+s);
for(i=2;i<95;i++)
{temp=f+s;
System.out.println(temp+"....Fibo");
f=s;
s=temp;
}


}
}



public static class Multitab extends Thread
{
public void run()
{
int i,k=27;
for(i=1;i<=30;i++)
{
System.out.println(k+"x"+i+"="+(k*i));
}
}
}


public static class print extends Thread
{
public void run()
{int a,i;
a=1;
for(i=0;i<60;i++)
{
System.out.println(a+".....print");
a++;
}
}
}


public static class square extends Thread
{
public void run()
{int a,i;
a=1;
for(i=1;i<=60;i++)
{
System.out.println(a*a+".....square"+i+" times");
a++;
}
}
}


public static void vectordemo()
{ int k,i;

Vector vec =new Vector();
k= vec.size();
System.out.println("the current size of the vector="+k);
vec.addElement("one"); //----adds the object
vec.addElement("two");
vec.addElement("three");
vec.addElement("four");
vec.addElement("five");


//k=fuz.length;
vec.addElement(vec);
System.out.println("The vector is:");
System.out.println(vec);
k=vec.size();
System.out.println("the current size of the vector="+k);
vec.removeElement("tuesday");


vec.insertElementAt("tuesday", 2);
System.out.println("the vector is="+vec);
k=vec.size();
System.out.println("the current size of the vector ="+k);
i=3;
System.out.println("the element at the given index="+ vec.elementAt(i));

vec.removeElementAt(3);

k=vec.size();
System.out.println("the current size of the vector ="+k);

}


/*
public static void fileprim()
{
File prim = new File("primdat.dat");

     FileOutputStream fos = new FileOutputStream(prim);
     DataOutputStream dos = new DataOutputStream(fos);

Scanner fuz= new Scanner(System.in);
//-----read a student data

int roll;
int mat,sci,geo;
char grade;

System.out.println("Enter rollno");
roll=fuz.nextInt();


System.out.println("Enter marks for maths");
mat=fuz.nextInt();

System.out.println("Enter marks for science");
sci=fuz.nextInt();


System.out.println("Enter marks for geography");
geo=fuz.nextInt();


int sum=mat+sci+geo;
int avg=sum/3;
//String gr=new String();
//System.out.println("Enter grade");   
//grade=gr.nextLine.charAT('0');
  try {
  dos.writeInt(roll);
dos.writeDouble(avg);
  dos.writeDouble(mat);
dos.writeDouble(sci);
dos.writeDouble(geo);

  dos.writeBoolean(true);
 //dos.writeChar(grade);
     }
  catch(IOException e) {  }
   finally
   { try {  dos.close();  fos.close();  }
    catch(IOException e) {  }
   } //------------- end of finally



FileInputStream fis = new FileInputStream(prim);
     DataInputStream dis = new DataInputStream(fis);
  try {
  int ival = dis.readInt();
 double dval = dis.readDouble();
    System.out.println("Rollno : "+ ival  + "\navg marks  = "+ dval+"\n maths marks"+mat );  

                                       //dos.writeBoolean(true);
                                       //dos.writeChar('s');
     }
  catch(IOException e) {  }
   finally
   { try {  dis.close();  fis.close();   }
    catch(IOException e) {  }
   } //------------- end of finally




}
*/
}//-----end of class COMBOfn
