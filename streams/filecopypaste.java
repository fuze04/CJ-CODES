import java.io.*;

class filecopypaste{

public static void main(String[] ans) throws Exception
{

FileReader fr = new FileReader(ans[0]);
FileWriter fw = new FileWriter(ans[1]);
int i;
char c;
try{
while((i=fr.read())!=-1)
{

c=(char)i;
fw.write(c);
}
}//---end of try
catch(IOException e)
{}
fr.close();
fw.close();
}
}