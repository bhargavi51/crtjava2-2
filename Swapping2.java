/* Swapping program without using c or storing variable*/
import java.util.*;

public class Swapping2
{
	
public static void main(String[] args) 

{
Scanner s=new Scanner(System.in);
	
int a,b;
	 
System.out.println("Enter the 2 values");
	
a=s.nextInt();
	 
b=s.nextInt();
	
System.out.println("values before swapping:" +a+ " " +b);
a=a+b;  /a=a*b;
	  
b=a-b;  /a=a/b;
	 
a=a-b;  /a=a/b;
	  
System.out.println("values after swapping:" +a+ " " +b);
	    
	}
}
