import java.util.*;

class Person {
  long mob;
  int age;
  long adhr;
  Scanner fuz = new Scanner(System.in);
String s=new String();
  void getInfo() {
    System.out.println("Enter Name");
    s=fuz.nextLine();
    System.out.println("Enter your Age");
    age = fuz.nextInt();
    System.out.println("Enter your adhaar number");
    adhr = fuz.nextLong();
    System.out.println("Enter your Mobile number number");
    mob = fuz.nextLong();
    
  }

  void showInfo() {
    System.out.println("\t  INFO\n");
    System.out.println("Name:-"+s+"\n"+"Age:-" + age + "\n" + "Adhar no.-" + adhr + "\n" + "Mobile number:-" + mob+"\n");
  }

} // ---end of person class

class Employee extends Person {

  int emp_id;
  int branch_n0;
   int salary;
void getInfo() {
super.getInfo();
    System.out.println("Enter the employee ID");
    emp_id = fuz.nextInt();
    
    System.out.println("Enter the branch number");
    branch_n0 = fuz.nextInt();
    
    System.out.println("Enter the salary");
    salary = fuz.nextInt();


  }

  void showInfo() {
System.out.println(   "employee-------");
super.showInfo();

    System.out.println("Employee ID: " + emp_id + "\n"  + "\n" + "Branch number: " + branch_n0+"Salary:-"+salary+"\n");
  }
} // ---end of employee class

class Manager extends Person {

  int x,tot,salary;
  void getInfo() {
super.getInfo();
System.out.println("Enter the salary");
    salary = fuz.nextInt();
    System.out.println("Enter the no of tsks completed this month:");
    x = fuz.nextInt();
    tot = x * salary;
  }

  void showInfo() {
System.out.println("manager-----");
super.showInfo();
    System.out.println("The salary of the manager is: " + tot);
  }
} // ---end of manager class

class Heiraibot {
  public static void main(String[] args) {
    Manager m1 = new Manager();
    Employee e1=new Employee();
    Person  p1=new Person();
p1.getInfo();
e1.getInfo();
  m1.getInfo();
    p1.showInfo();
    e1.showInfo();
    m1.showInfo();

    
    
    
     
  } // ---end of public
} // ---end of Heira class
