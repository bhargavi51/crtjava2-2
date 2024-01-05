class First

{
    
void show(float x,float y)
    
{
        
System.out.println("two args float method");
    
}
     
void show(double c)
    
{
        
System.out.println("one arg double method");    
        
    
} 

 
void add(int x, int y,int z,int a)
    
{
        
System.out.println("4 args int method");
    
}

}

public class AutomaticPromotionOverloading{
	
public static void main(String[] args) 
{
	     
First s1=new First(); 
		
s1.show(45.6);
		
s1.show(1,2);
		
s1.show(21.2f);
		
	
}

}

