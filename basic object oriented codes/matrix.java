import java.util.*;

 class matrix {

int n,i,j,m,p,q,k;
      int arr[][]=new int[10][10];
      int addarr[][]=new int[10][10];
   Scanner fuz= new Scanner(System.in);
void getrow()
{ 
 n=fuz.nextInt();
 m=fuz.nextInt();
}


void getvalue()
{

 for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
      arr[i][j]=fuz.nextInt();
        }
    }

}//---end of func



void showmat()
{

 for (i=0;i<n;i++) {
        for(j=0;j<m;j++)
        {
        
      System.out.print(arr[i][j]+"  ");
    }
      System.out.println();
    
    }

}



matrix addmat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

temp.addarr[i][j]=arr[i][j]+m2.arr[i][j];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of addmat





matrix submat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

temp.addarr[i][j]=arr[i][j]-m2.arr[i][j];
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of submat







matrix multmat(matrix m2)
{
    matrix temp=new matrix();
for(i=0;i<n;i++)
{
for(j=0;j<m2.m;j++)
{addarr[i][j]=0;
for(k=0;k<m;k++)
{
temp.addarr[i][j]+=arr[i][k]*m2.arr[k][j];
}
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m2.m;j++)
{

System.out.print(temp.addarr[i][j]+" ");
}
System.out.println();
}
return(temp);
}//---end of submat








  public static void main(String[] args) {
       
Scanner fuz= new Scanner(System.in);
matrix m1=new matrix();//---1st matrix
matrix m2=new matrix();//---2nd matrix
matrix m3=new matrix();//---addition of matrix




    System.out.print("Enter the row and column  size of the array:");
   m1.getrow();

    System.out.print("Enter the values in the array:");
   m1.getvalue();
    System.out.print("Displaying the array\n");
      m1.showmat();

System.out.print("Enter the row and column  size of the 2nd  array:");
   m2.getrow();

    System.out.print("Enter the values in the array:");
   m2.getvalue();
    System.out.print("Displaying the array\n");
      m2.showmat();


   int ch;
System.out.print("what operation u want to do:");
System.out.println(" press 1 for addition");
System.out.println(" press 2 for subtraction");
System.out.println(" press 3 for multiplication");
ch=fuz.nextInt();


switch(ch)
{
case 1:
System.out.print(" Addition of the matrix\n");
m3=m1.addmat(m2);
m3.addmat(m2);
break;
case 2:
System.out.print(" Subrtraction of the matrix\n");
m3=m1.submat(m2);
m3.submat(m2);
break;
case 3:
System.out.print(" Multiplication  of the matrix\n");
m3=m1.multmat(m2);
m3.multmat(m2);
break;
default:
System.out.println(" wrong input");
  }
  }//---end of public statement
}//---end of main

