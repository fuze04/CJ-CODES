import java.util.*;
class Employee{

    Scanner rc=new Scanner(System.in);
    int id,sal;
    String s=new String();
    void getinfo(){
    System.out.println("Enter Name");
    s=rc.nextLine();
    System.out.println("Enter Employee id");
    id=rc.nextInt();
    System.out.println("Enter the Current Salary:");
    sal=rc.nextInt();
    }
    void showinfo(){
        System.out.println("-----------Employee Details---------------");
        System.out.println("Employee Designation: ");
        System.out.println("Name: "+ s);
        System.out.println("Employee id: "+id);
        System.out.println("Salary: "+ sal);
    }
}//-----end of Employee

    class Manager extends Employee{
        Scanner rc=new Scanner(System.in);
        int n,bonus;
        void getinfo(){
            super.getinfo();
            System.out.println("Enter the number of sessions: ");
            n=rc.nextInt();
            bonus=sal+3000;
        }
        void showinfo(){
            System.out.print(" Manager");
            super.showinfo();
            System.out.println("Number of Sessions Taken: "+n);
            System.out.println("Bonus Salary: "+ bonus);
    }
}//----end of manager

    class Scientist extends Employee{
        Scanner rc=new Scanner(System.in);
        int n;
        void getinfo(){
            super.getinfo();
            System.out.println("Enter the number of projects completed: ");
            n=rc.nextInt();
            sal=sal+4000;
            System.out.println("----------------------------------------");
        }
        void showinfo(){
            System.out.print(" Scientist");
            super.showinfo();
            System.out.println("Number of Projects completed: "+ n);
            System.out.println("----------------------------------------");
        }
    }//----end of scientist



class dispatch{
    public static void main(String[] args) {
        Employee emp;
                                                   //  Manager m;
                                                   //  Scientist s;
Scanner x = new Scanner(System.in);
int ch;

System.out.println(" Enter 1 for manager and 2 for scientist ");
ch = x.nextInt();
if(ch==1)emp=new Manager() ;           //------------------ assigning sub class object to super class reference.
else emp=new Scientist();

System.out.println(" working with the chosen employee------");
emp.getinfo(); emp.showinfo();
//-----------------------------------------------------------------
//dynamic dispatch
    }
}