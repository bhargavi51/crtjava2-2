import java.util.*;

public class QuadraticRoot

{
	
public static void main(String[] args) 
{
		
Scanner s=new Scanner(System.in);
	   
double a,b,c;
		
System.out.println("Enter the Year :");
		a=s.nextDouble();
		
b=s.nextDouble();
		
c=s.nextDouble();
		
double r1,r2,d;
		
d=b*b-4*a*c;
		
if(d<0)
		
{
		   
System.out.println("Roots are imaginary"); 
		}
		
else
		
{
		    
r1=(-b+Math.sqrt(d))/(2*a); 
		    
r2=(-b-Math.sqrt(d))/(2*a);
		   System.out.println("Root1=" +r1);
		   System.out.println("Root2=" +r2);
		    }
	
}

}
