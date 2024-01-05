
class First

{
    
void m1()
    
{
        
System.out.println("m1 method in first class");
    
}
    
void m2()
    
{
        
System.out.println("m2 method in first class");
    
}

}    
    
class Second extends First
    
 {
        
void m3()
    
{
        
System.out.println("m3 method in first class");
    
}

}

public class Inheritance1
{
	
public static void main(String[] args) 
{                                                    
	   
Second s1=new Second();
	   
s1.m1();
	   
s1.m2();
	   
s1.m3();
	
}

}
