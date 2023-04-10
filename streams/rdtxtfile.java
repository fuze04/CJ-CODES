    import java.io.*; 
    class rdtxtfile
 {  public static void main(String[] ans)
    {    File rf = new File("sydemo.txt");
         FileReader  inf = null;
              char c=' ';
              int i=0, k=8;  
         try{    inf = new FileReader(rf);
                   while (i<k)         //--------------------  check with end of file condition 
                  {  c = (char) inf.read();
                     i++; 
                     System.out.println("-------> " + c);
               }  } 
    catch(IOException e) { System.out.println(e); } 
    finally { try  { inf.close();    }
                      catch(IOException e) {  } 
                }  
    }  // ------ end of main
}//--------------- end of class
     