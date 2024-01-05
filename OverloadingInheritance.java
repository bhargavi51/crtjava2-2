class First

{
    
void add(int x,int y)
    
{
        
System.out.println(x+y);
    
}
     
void add(int x,int y,int z)
    
{
        
System.out.println(x+y+z);    
        
    
} 

}

class Second extends First

{
    
void add(double x, double y,double z,double a)
    
{
        
System.out.println(x+y+z+a);
    
}

}

public class OverloadingInheritance
{
	
public static void main(String[] args) 
{
		
Second  s1=new Second(); 
		
s1.add(45,6);
		
s1.add(1,2,5);
		
s1.add(21.2,43.5,78.0,788.4);
		
	
}

}

