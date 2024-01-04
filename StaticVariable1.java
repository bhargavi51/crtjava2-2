class StaticVariable1
 
{
      
int a=10;
     
static  int b=20;
     
public static void main(String args[])
     
{
         
StaticVariable1 s1=new StaticVariable1();
         
StaticVariable1 s2=new StaticVariable1();
         
System.out.println(s1.a+" "+s1.b);
         
System.out.println(s2.a+" "+s2.b);
         
s1.a=888;
         
s2.b=999;
         
System.out.println(s1.a+" "+s1.b);
         
System.out.println(s2.a+" "+s2.b);
         
     
}
 
}