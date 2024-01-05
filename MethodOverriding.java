class Parent

{
    
void Surname()
    
{
         
System.out.println("rrr");
       
 }
    
void designation()
    
{
        
System.out.println("Developer");
    
}

}

class Child extends Parent

{
    
void designation()
    
{
        
System.out.println("Java programmer");
    
}

}

public class MethodOverriding
{
	
public static void main(String[] args) 
{
	     
Child c1=new Child(); 
		 
c1.Surname();
		 
c1.designation();
	
}

}

