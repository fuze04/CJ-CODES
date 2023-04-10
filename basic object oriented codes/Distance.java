import java.util.*;

class Distance{
 
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


public static void main(String[] fuz){
 
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
   
}
}