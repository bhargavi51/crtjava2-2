import java.util.*;

public class SwitchCase2
{
	
public static void main(String[] args)
	
{
	
Scanner s=new Scanner(System.in);
	
int a,b,r;
	
System.out.println("Enter 2 numbers");
	
a=s.nextInt();
	
b=s.nextInt();
	
System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication \n 4.Division ");
	
System.out.println("Enter your choice");
	
int ch;
	
ch=s.nextInt();
	
switch(ch)
	
{
	   
case 1:
	       
r=a+b;
	       
System.out.println("sum  of 2 numbers is:" +r);
	       
break;
	   
case 2:
	       
r=a-b;
	       
System.out.println("difference of 2 numbers is:" +r);
	       break;
	   	
case 3:
	       
r=a*b;
	       
System.out.println("product of 2 numbers is:" +r);
	       
break;
	    
case 4:
	       
r=a/b;
	       
System.out.println(" division of 2 numbers is:" +r);
	       break;
	    
default:
	       
System.out.println("Enter valid number");
	   
	
	}
	 
	
}

}
