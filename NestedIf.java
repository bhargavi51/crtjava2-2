import java.util.*;

public class NestedIf
{
	
public static void main(String[] args) 
	
{
	
Scanner s=new Scanner(System.in);
		int a,b,c;
		
System.out.println("Enter the values for a,b,c:");
		a=s.nextInt();
		
b=s.nextInt();
		
c=s.nextInt();
		
if(a>b)
		
{
		    
if(a>c)
		    
{
		     
System.out.println(a+"  a is biggest");
		    }
		    
else
		    
{
		    
System.out.println(c+" c is biggest ");
		    }
		
}
		
if(b>c)
		
{
		
System.out.println(c+" b is biggest");
		
}
		
else
		
{
		
System.out.println(c+" c is biggest"); 
		
}
	
}

}
