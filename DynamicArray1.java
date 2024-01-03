import java.util.*;

public class DynamicArray1

{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	
int a[],i,n;
	
System.out.println("enter the size of the array");
	n=s.nextInt();
	
a=new int[n];
	
System.out.println("enter the elements into array");
	for(i=0;i<n;i++)
	
{
	    
a[i]=s.nextInt();
	
}
	
System.out.println("The elements in the array:");
	for(i=0;i<n;i++)
	
{
	    
System.out.print(a[i]+" ");
	
}
	
}

}
