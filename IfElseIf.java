import java.util.*;

public class IfElseIf
{
	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
int a,b,c; 
	
System.out.println("Enter 3 numbers");
	
a=s.nextInt();
	
b=s.nextInt();
	
c=s.nextInt();
	
if (a<b&&a<c)
	
{
	    
System.out.println(a+"A is smallest Number");
	
}
	
else if(b<c)
	
{
	   
System.out.println( b+ " B is smallest Number"); 
	
}
	
else 
{
	   
System.out.println( c+ " C smallest Number");  
	
}
	
}

}


