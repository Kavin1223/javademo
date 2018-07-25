import java.util.Scanner;
package demo
class Student_de
{
 int total;
void get(int studentid,String studentname,int m)
{

//System.out.println("physics mark is\t"+p);
//System.out.println("chem mark is\t"+c);
System.out.println("math mark is\t"+m);
//total=m+p+c;
//System.out.println("math mark is\t"+total);

}
}
class duble
{
public static void main(String arg[])
{
Student_de obj=new Student_de();
obj.get(9,"kavin",5);
System.out.println("math mark is\t"+obj.total);
}
}