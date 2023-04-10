import java.util.*;

class Vectdemo
{    public static void main(String[] sh)
     {    int k,i;
         
          Vector vec = new Vector();
         
          k=vec.size();  //---------returns an integer
          System.out.println("The current size of the vector="+k);
         

    //  k=sh.length;  //------reading through command line
     //for(i=0;i<k;i++)
      //vec.addElement(sh[i]);

vec.addElement("two");
vec.addElement("three");
vec.addElement("four");
vec.addElement("five");


      System.out.println("The vector is=");
      System.out.println(vec);
     k=vec.size();
      System.out.println("the current size of the vector="+k);
     vec.insertElementAt("tuesday", 2);
      System.out.println("the vector is="+vec);
      k=vec.size();
      System.out.println("the current size of the vector after adding vector ="+k);
     vec.removeElement("tuesday");
      k=vec.size();
      System.out.println("the current size of the vector after removing one vector ="+k);
     vec.removeElementAt(1);
      k=vec.size();
      System.out.println("the current size of the vector after removing one vector ="+k);
     System.out.println("The index of four is"+vec.indexOf("four"));
     vec.removeAll(vec);
      System.out.println(vec);
      k=vec.size();
      System.out.println("the current size of the vector="+k);
      
      }
}