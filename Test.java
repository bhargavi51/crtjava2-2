import java.util.Scanner;
import Bhargav.Arth;
class Test
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter 2 numbers");
a=s.nextInt();
b=s.nextInt();
Arth a1=new Arth();
int r=a1.add(a,b);
System.out.println("Addition"=+r);
System.out.println("product="+a1.mul(a,b));
}
}