import java.io.*;
import java.util.*;

class streams2{

public static void main(String[] ans)
{
/*
try{

FileWriter fw=new FileWriter("sydemo.txt");
fw.write("hellosbdsdcbs");
fw.close();
}
catch(IOException e)
{}


*/







try{

FileReader fr = new FileReader("sydemo.txt");
Scanner sc= new Scanner(fr);
while(sc.hasNextLine())
{
String line=sc.nextLine();
System.out.println(line);
fr.close();
}
}
catch(IOException e)
{}


}

}
