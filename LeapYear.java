import java.util.*;

public class LeapYear
{
	
public static void main(String[] args) 
	
{
	
Scanner s=new Scanner(System.in);
	   
int a;
		
System.out.println("Enter the Year :");
		a=s.nextInt();
		
if(a%4==0 && (a%100!=0 || a%400==0))
		
{
		     
System.out.println("Leap year");   
		    }
		  
else
{
		      
System.out.println(" not Leap year");  
		  }
		    
		
		
}

}