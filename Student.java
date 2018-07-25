import java.util.Scanner;
class Student
{
int studentid;
String studentname;
int total,m,p,c;
float avg;
void get()
{
System.out.println("enter id");
Scanner scan=new Scanner(System.in);
studentid=scan.nextInt();
System.out.println("enter name");
studentname=scan.next();
System.out.println("enter marks");
m=scan.nextInt();
p=scan.nextInt();
c=scan.nextInt();
System.out.println("physics mark is\t"+p);
total=m+p+c;
}
float display()
{
avg=total/3;
return avg;
}

public static void main(String arg[])
{
float sum;
Student obj=new Student();
obj.get();
sum=obj.display();
System.out.println(sum);
System.out.println(obj.total);
System.out.println(obj.p);
}
}


 