import java.io.*;
import java.util.*;


 class fileprim
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
//----------------------------------------------------------------------------------------- reading the file
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
   { try {  dis.close();  fis.close();  }
    catch(IOException e) {  }
   } //------------- end of finally




 }  //----------end of main
}  //--------------------end of class
