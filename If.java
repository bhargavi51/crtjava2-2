import java.util.*;
public class If
{
	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
int a,b,c;
	
System.out.println("Enter 2 numbers");
	
a=s.nextInt();
	
b=s.nextInt();
	
if(b==0)
	
{
	  
System.out.println("Any number can't divisible by 0:");
	  b=2;
	
}
	   
c=a/b;
	   
System.out.println("Division:" +c);
	
}
	
	

}
