import java.util.*;

class wrap
{  public static void main(String[] sh)
    {  int i,n,flg=0;
       
        n=Integer.parseInt(sh[0]);
 
        for(i=2;i<n;i++)
       { if (n%i==0)  {flg++; break;}}

       if(flg!=0) System.out.println("It is a Composite Number");
       else System.out.println("It is a Prime Number");
    }
}
