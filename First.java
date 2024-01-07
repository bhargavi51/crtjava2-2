package pack1;
public class First
{
private int a=10;
int b=20;
protected int c=30;
public int d=40;
void show1()
{
System.out.println("Private="+a);
System.out.println("Default="+b);
System.out.println("Proctected="+c);
System.out.println("Public="+d);
}
public static void main(String args[])
{
First f1=new First();
f1.show1();
}
}

