
import java.util.*;

public class Boat
{

public static void main(String[] args) 

{

Scanner s=new Scanner(System.in);

int a,b,c,d;

System.out.println("Enter the adults Number");

a=s.nextInt();

System.out.println("Enter the childrens Number");

b=s.nextInt();

c=600;	/*here the weight is fixed*/

d=a*75+b*30;

if(c>=d)

{

System.out.println("Boat will Move");   
	   
 }
	    
else
{

System.out.println("Boat will drown");
	   
}
	   
	
}

}
