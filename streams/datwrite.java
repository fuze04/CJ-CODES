import java.io.*;
import java.util.*;


 class datwrite
{

 public static void main(String arg[]) throws IOException
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

  try {
  dos.writeInt(roll);
dos.writeDouble(avg);
  dos.writeDouble(mat);
dos.writeDouble(sci);
dos.writeDouble(geo);

  dos.writeBoolean(true);
 
     }
  catch(IOException e) {  }
   finally
   { try {  dos.close();  fos.close();  }
    catch(IOException e) {  }
   } //------------- end of finally
}
}