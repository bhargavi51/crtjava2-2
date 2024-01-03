
import java.util.*;

public class ArraySorting

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
	
System.out.println("  Elements  before sorting");
	
for(i=0;i<n;i++)
	
{
	   
System.out.println(a[i]+" ");
	    
}
	    
Arrays.sort(a);
	
System.out.println("Elements  after sorting");
    	
for(i=0;i<n;i++)
	
{
	   
System.out.println(a[i]+" ");
	    
}
	
}

}
