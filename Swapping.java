/*using temporary variable*/
import java.util.*;

public class Swapping
{

public static void main(String[] args) 

{
	
Scanner s=new Scanner(System.in);

int a,b,c;

System.out.println("Enter the 2 values");
	  
a=s.nextInt();
	
b=s.nextInt();

System.out.println("values before swapping:" +a);
	    System.out.println("values before swapping:" +b);

c=a;
	
a=b;

b=c;
System.out.println("values after swapping:" +a);
	    System.out.println("values after swapping:" +c);
	    
	    
	}

}
