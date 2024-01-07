package pack2;
import pack1.First;
class Fourth extends First
{

void show4()
{ 
//System.out.println("Private a="+a);
//System.out.println("Default b="+b);
System.out.println("Proctected c="+c);
System.out.println("Public d="+d);
}
public static void main(String args[])
{
Fourth s1=new Fourth();
s1.show4();
}
}
