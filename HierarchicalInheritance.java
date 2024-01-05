class Data

{
    
int a,b;
    
void get(int a,int b)
    
{
        
this.a=a;
        
this.b=b;
    
}
    
void show()
    
{
        
System.out.println("a="+a+ " b="+b);
    
}

}    
    
class Addition extends Data
    
{
        
void total()
    
{
       
System.out.println("Addition="+(a+b)); 
    
}

}
   
class Multiply extends Data
   
{
    
void Multiplication()
    
{
        
System.out.println("Multiplication="+(a*b));  
    
}
    

} 
 
class HierarchicalInheritance
{
	
public static void main(String[] args) 
{                                                    
	   
Addition r1=new Addition();
	   
r1.get(111,2);
	   
r1.show();
	   
r1.total();
	  
Multiply m1=new Multiply();
	  
m1.get(5,2);
	  
m1.show();
	  
m1.Multiplication();
	
}

}

