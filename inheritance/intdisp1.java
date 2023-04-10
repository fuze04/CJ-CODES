import java.util.*;

interface calculate{
    double pi=3.14;
    public double calci();

}

class rectangle implements calculate{
    double l,b,area;
    Scanner r=new Scanner(System.in);
    
    void getdata(){
        System.out.println("Enter the length of the rectangle:");
        l=r.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b=r.nextDouble();
    }
    
    void showdata(){
        System.out.println("The length and breadth of the rectangle = "+l+" x "+b);
    }
    
    public double calci(){
        area=l*b;
        return(area);
    } 
}

class circle implements calculate{
    int rad;
    double area;
    Scanner s=new Scanner(System.in);
    
    void getdata(){
        System.out.println("Enter the radius of the circle:");
        rad=s.nextInt();
    }
    
    void showdata(){
        System.out.println("The radius of the circle = "+rad);
    }
    
    public double calci(){
        area=pi*rad*rad;
        return(area);
    }
}

class intdisp1{
    public static void main(String[] ans){
        double k;
        Scanner sr=new Scanner(System.in);

    /*    rectangle r=new rectangle();
        r.getdata();
        r.showdata();
        
        circle cr=new circle();
        cr.getdata();
        cr.showdata();
        */
        
        //=========dispatch==============
        int ch;
        System.out.println("\n1. Rectangle\n2. Circle:");
        ch=sr.nextInt();
        calculate cal;
        
        if(ch==1){
            cal=new rectangle();
            ((rectangle)cal).getdata();
             ((rectangle)cal).showdata();
        }
        else if(ch==2){
            cal=new circle();
            ((circle)cal).getdata();
    ((circle)cal).showdata();
        }
        else{
            System.out.println("Invalid choice.");
            return;
        }
       
        double d=cal.calci();
        System.out.println("The area is: " + d);
 

    }
}