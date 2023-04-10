import java.io.*;
import java.util.*;


 class datread
{

 public static void main(String arg[]) throws IOException
 {
     File prim = new File("primdat.dat"); 
FileInputStream fis = new FileInputStream(prim);
     DataInputStream dis = new DataInputStream(fis);
  try {
  int ival = dis.readInt();
 double dval = dis.readDouble();
int mval=dis.readInt();
    System.out.println("Rollno : "+ ival  + "\navg marks  = "+ dval+"\n maths marks"+mval );  

                                      
     }
  catch(IOException e) {  }
   finally
   { try {  dis.close();  fis.close();  }
    catch(IOException e) {  }
   } //------------- end of finally




 }  //----------end of main
}  //--------------------end of class