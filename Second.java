package pack1;
import pack1.First;
class Second extends First
{

void show2()
{
//System.out.println("Private="+a);
System.out.println("Default="+b);
System.out.println("Proctected="+c);
System.out.println("Public="+d);
}
public static void main(String args[])
{
Second s1=new Second();
s1.show2();
}
}

