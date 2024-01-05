class First

{
    
void show(double...a)
    
{
        
System.out.println("one args double method");
    
}
     
void show(double c,double d)
    
{
        
System.out.println("2 arg double method");    
        
    
} 

}

public class VarArgMethod

{
	
public static void main(String[] args) 
{
	     
First s1=new First(); 
		
s1.show(45.6,22.3);
		
s1.show();
		
s1.show(21,76,986);
		
	
}

}

