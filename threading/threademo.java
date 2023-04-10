import java.util.*;


class Fibo extends Thread
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



class Multitab extends Thread
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


class print extends Thread
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


class square extends Thread
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


class threademo
{
public static void main(String[] fuz)
{
Fibo f=new Fibo();
Multitab m=new Multitab();
print p=new print();
square s=new square();
f.start();
m.start();
p.start();
s.start();

}
}