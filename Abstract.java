abstract class Parent

{
     
void show()
    
{
        
System.out.println("show method in parent class");
    
}
   
public abstract void m1();
   
public abstract void m2();
   
public abstract void m3();
    
}
    
abstract class Child1 extends Parent

{
    
public void m1()
    
{
        
System.out.println("m1 abstract method in child1 class");
    
}
    
    
public void m2()
    
{
        
System.out.println("m2 abstract method in child1 class");
    
}

}

class Child2 extends Child1

{
   
 public void m3()
    
{
        
System.out.println("m3 abstract method in child2 class");
    
}

}


public class Abstract
{
	
public static void main(String[] args) 
	
{
	    
Child2 c2=new Child2();
        
c2.show();
        
c2.m1();
        
c2.m2();
        
c2.m3();
	
}

}
  