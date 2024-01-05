class First

{
    
void show(int x)
    
{
        
System.out.println("one arg with int");
    
}
     
void show(int x,int y)
    
{
        
System.out.println("two arg with int");
    
} 
   
void show(double x)
    
{
        
System.out.println("one arg with double");
    
}
    

}

public class MethodOverloading
{
	
public static void main(String[] args) 
{
		
First f1=new First(); 
		
f1.show(45.6);
		
f1.show(21);
		
f1.show(1,2);
	
}

}

