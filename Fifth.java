package pack2;
import pack1.First;
class Fifth
{

void show5()
{ 
First f1=new First();
//System.out.println("Private a="+f1.a);
//System.out.println("Default b="+f1.b);
//System.out.println("Proctected c="+f1.c);
System.out.println("Public d="+f1.d);
}
public static void main(String args[])
{
Fifth f2=new Fifth();
f2.show5();
}
}
