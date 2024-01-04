public class Static
1
{  
    
int a=10;
    
static int  b=20;
    
void m1()
    
{
        
System.out.println("a="+a+ " b="+b);
    
}
    
static void m2()
    
{
        
Static s1=new Static();
        
System.out.println("a="+s1.a+ " b="+b);
    
}
     
public static void main (String[] args) 
     
{
        
Static s1=new Static();
        
s1.m1();
        
s1.m2();
	
}

}


