/* Calculating Area of rectangle*/
import java.util.*;

public class Rectangle
{

public static void main(String[] args )

{

Scanner s=new Scanner(System.in);

int length,breadth;
	
int Area;

System.out.println("Enter the length of Rectangle");

length=s.nextInt();

System.out.println("Enter the breadth of Rectangle");
	
breadth=s.nextInt();

Area=length*breadth;

System.out.println("The area of Rectanangle is:" +Area);
	}

}
