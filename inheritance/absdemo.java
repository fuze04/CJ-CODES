import java.util.*;

abstract class Shape1                      //---Abstract class
{ 
	public void circle()        
	{
	  System.out.println("The shape is a circle");
	}
	public abstract void square();       //---Abstract methods
	public abstract void rectangle();
	public abstract void triangle();
}

 abstract class Shape2 extends Shape1
{ 
	public void square()        
	{
	  System.out.println("The shape is a square");
	}

}

class Shape3 extends Shape2		     //---Concrete
{
	public void rectangle()        
	{
	  System.out.println("The shape is a rectangle");
	}
	public void triangle()        
	{
	  System.out.println("The shape is a triangle");
	}
}

class absdemo
{
	public static void main(String[] sh)
	{ 
	   Shape3 obj= new Shape3();
	   obj.circle();
	   obj.square();
	   obj.rectangle();
	   obj.triangle();
	}
}