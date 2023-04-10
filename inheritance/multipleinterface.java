import java.util.*;

interface company
{
Scanner fuz =new Scanner(System.in);
public double salary();
double dev=1000;
double hri=2000;
double man=2500;
double tes=1700;
}

class developer implements company
{double day;

void getdata()
{

String a,des;
System.out.println("Enter the name ");
 a=fuz.nextLine();

System.out.println("Enter your Designation");
  des=fuz.nextLine();
}
void getnum()
{
System.out.println("Enter The number of days you work in this month");
 day=fuz.nextInt();

}
public double salary()
{
return(day*dev);
}
}


class hr implements company
{int days;
void getdata2()
{String nam,desig;
System.out.println("Enter the name ");
  a=fuz.nextLine();

System.out.println("Enter your Designation");
 desig=fuz.nextLine();
}
void getnum2()
{
System.out.println("Enter The number of days you work in this month");
  days=fuz.nextInt();

}
public double salary()
{
return(days*hri);
}
}


class manager implements company
{String a,des;
  double day;
void getdata()
{
System.out.println("Enter the name ");
  a=fuz.nextLine();

System.out.println("Enter your Designation");
  des=fuz.nextLine();
}
void getnum()
{
System.out.println("Enter The number of days you work in this month");
  day=fuz.nextInt();

}
public double salary()
{
return(day*man);
}
}

class testing implements company
{double day;
void getdata()
{String a,des;
System.out.println("Enter the name ");
  a=fuz.nextLine();

System.out.println("Enter your Designation");
  des=fuz.nextLine();
}
void getnum()
{
System.out.println("Enter The number of days you work in this month");
  day=fuz.nextInt();

}
public double salary()
{
return(day*tes);
}
}


class multipleinterface
{
public static void main(String[] sha)
{
manager m=new manager();
developer d= new developer();
testing t= new testing();
 hr h= new hr();


d.getdata();
d.getnum();

 double k=d.salary();
System.out.println("The salary of the developer is "+k);


h.getdata2();
h.getnum2();

 k=h.salary();
System.out.println("The salary of the Human resource manager  is "+k);



m.getdata();
m.getnum();

k=m.salary();
System.out.println("The salary of the manager is "+k);


t.getdata();
t.getnum();

 k=t.salary();
System.out.println("The salary of the tester  is "+k);


}
}
