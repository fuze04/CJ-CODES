import java.io.*;

 class Filecopy
{ 
  public static void main(String[] ans) throws Exception 
  {      
      FileReader fr = new FileReader(ans[0]); 
      FileWriter fw = new FileWriter(ans[1]);

    int i=0; char c;

    try{  while (i!=-1) //-------------- checking end of file 
            {    
                       i = fr.read(); 
                       if(i==-1) break; 
                       System.out.println("copying ----  "+ (char)i);  //----  this is to check the loop 
                       c = (char)i;     
                      fw.write(c);
             } 
         }
   catch( IOException e) {  }

      finally {  try { fr.close(); fw.close();}
                  catch(IOException e) {  }
                }
  } 
} 