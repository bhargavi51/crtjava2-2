import java.util.*; 

public class SquareRoot{
	
public static void main(String[] args) 

{
Scanner s=new Scanner(System.in);
double a,b;
	    
System.out.println("Enter a Number");
	    
a=s.nextInt();
	    
b=Math.sqrt(a);
  
/* Math is a class in java.lang we are not importing java.lang bcz 
it is already in-builted */
System.out.println("The square root of given Number is :");
	   
System.out.println(b);
	    
	    
	   
	
}

}
