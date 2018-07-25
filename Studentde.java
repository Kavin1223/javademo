import java.util.Scanner;
class Student_de
{
int total;
void get(int studentid,String studentname,int m,int p,int c)
{

System.out.println("physics mark is\t"+p);
System.out.println("chem mark is\t"+c);
System.out.println("math mark is\t"+m);
total=m+p+c;
System.out.println("math mark is\t"+total);

}

public static void main(String arg[])
{
Student obj=new Student();
obj.get(9,"kavin",5,10,20);

}
}
