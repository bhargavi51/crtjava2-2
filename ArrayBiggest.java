import java.util.*;

public class ArrayBiggest
{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	
int a[],i,n,big;
	
float avg;
	
System.out.println("enter the size of the array");
	n=s.nextInt();
	
a=new int[n];
	
System.out.println("enter the elements into array");
	for(i=0;i<n;i++)
	
{
	    
a[i]=s.nextInt();
	
}
	
big=a[0];
	
for(i=0;i<n;i++)
	
{
	    
if(big<a[i])
	    
big=a[i];
	    
}
	
System.out.println("Biggest Element in array is: " +big);

	
}

}
