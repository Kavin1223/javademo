import java.util.Scanner;
class Nested
{
public static void main(String args[])
{
char a;
System.out.println("enter the char");
Scanner scan=new Scanner(System.in);
a=scan.next().charAt(0);
if(a=='c')
{
if(a=='C')
System.out.println("the value is caps");
else
System.out.println("not caps");
}
else
{
if(a=='b')
{

System.out.println("it is b");
}
else
{
System.out.println("not ");
}
}
}
}