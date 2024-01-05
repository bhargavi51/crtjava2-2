class First

{
    
int a=100;
    
void show()
    
{
        
System.out.println("Super Demo");
    
}

}    
    
class Second extends First
    
{
        
int a=256;
        
void show(int a)
        
{
            
super.show();
            
System.out.println(a);
            
System.out.println(this.a);
            
System.out.println(super.a);
            
        
}

}
 
class Super
{
	
public static void main(String[] args) 
{                                                    
	   
Second s1=new Second();
	   
s1.show(888);
	
}

}

