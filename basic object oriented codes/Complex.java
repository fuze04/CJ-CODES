import java.util.*;

class Complex{
 
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

public static void main(String[] fuz){
 
    Complex C1 = new Complex();//---getcomp
    Complex C2 = new Complex();//---2nd complex
    Complex C3 = new Complex();//---addcomp
  
    

System.out.println("-----------------------------------------------------------");

  /*  System.out.print("Enter the 1st Complex number");
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

*/


Scanner sc= new Scanner(System.in);
int n,i;
System.out.println("Enter the size of the array");
 n=sc.nextInt();

Complex arrcomp[]=new Complex[10];

for(i=0;i<n;i++)
{
arrcomp[i]=new Complex();
arrcomp[i].getcomp();
arrcomp[i].showcomp();
}



}//---end of main
}//---end of class