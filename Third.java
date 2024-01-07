package pack1;
import pack1.First;
class Third
{

void show3()
{ 
First f1=new First();
//System.out.println("Private="+f1.a);
System.out.println("Default="+f1.b);
System.out.println("Proctected="+f1.c);
System.out.println("Public="+f1.d);
}
public static void main(String args[])
{
Third t1=new Third();
t1.show3();
}
}
