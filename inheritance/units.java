import java.util.*;
class kilogram{

Scanner fuz=new Scanner(System.in);
int kg,g;

void getinfo()
{
kg=fuz.nextInt();
g=fuz.nextInt();
}

void showinfo()
{
System.out.println(kg+"."+g);
}

int convert()
{
return((kg*1000)+g);
}
}

class gram extends kilogram
{

int mg;

void getinfo()
{

super.getinfo();
mg=fuz.nextInt();
}

void showinfo()
{
super.showinfo();
System.out.print("."+mg);
}

int convert()
{
int x= super.convert();
return(x*1000);
}
}

class units
{
public static void main(String[] args)
{

kilogram g1 = new kilogram();
gram kg1= new gram();
System.out.println("Working with kilograms");

System.out.println("Enter the kilogram and grams");
g1.getinfo();
System.out.println("the Unit is");
g1.showinfo();

int k=g1.convert();
System.out.println("The weight in grams are: "+k);

System.out.println("Operations with grams");
System.out.println("Enter kilograms,grams and miligram");
kg1.getinfo();
System.out.println("the Unit is");
kg1.showinfo();

k=kg1.convert();
System.out.println("The weight in miligrams are: "+k);
}
}

