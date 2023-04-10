   import java.util.*; 
   
    class Time 
    {   int hr,min; 
               Scanner fuz=new Scanner(System.in);
        void getTime() 
          { 
              hr = fuz.nextInt();
              min = fuz.nextInt();  
          }
         void showTime() 
          { 
              System.out.print(hr+":"+min);
          }
        
         int convert() 
             {
               return(hr*60+min ); 
             }   

    } //----------------------------------------
     
  class Stime extends Time
   {   int sec;
        
        void getTime()
            { 
               super.getTime(); 
               sec = fuz.nextInt(); 
            }
         void showTime()
         { 
             super.showTime(); 
             System.out.print(" :"+ sec);
         }
        int convert() 
         { int x=super.convert(); 
           x = x*60+sec;
           return(x);
         }
    
    }  //-----------------------------------------
  
  class Mtime extends Stime
    {  int msec; 
          void getTime()
           {
            super.getTime(); 
            msec =fuz.nextInt(); 
           }
         void showTime() 
          {  
            super.showTime(); 
            System.out.println(" :"+msec);
         }
         int convert()
         {  
            int x=super.convert(); 
            x = x*60+sec;
            return(x);
        }
       
    }//-----------------------------------------------
    
       class MultiInh
    {  public static void main(String[] ans)
        {    Mtime m = new Mtime();
             Stime s = new Stime();
             Time t = new Time();
           int k; 

          



          System.out.println(" \noperations with Time object....\n");
              t.getTime();
              t.showTime();
            k = t.convert();
            System.out.println(" The time in minutes = "+ k); 


             
          System.out.println(" \noperations with Stime object....\n");
              s.getTime();
              s.showTime();
                 k = s.convert();
           System.out.println(" The time in seconds = "+ k);  


  
              System.out.println(" operations with Mtime object....");
              m.getTime();
              m.showTime();
            k = m.convert();
           System.out.println(" The time in milli sec.s  = "+ k);


         } //---------------- end of main
     }  //------------ end of main class