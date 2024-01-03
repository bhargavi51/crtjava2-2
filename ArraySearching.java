import java.util.*;

public class ArraySearching
{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	
int a[],i,n,sno;
	
System.out.println("enter the size of the array");
	
n=s.nextInt();
	
a=new int[n];
	
System.out.println("enter the elements into array");
	
for(i=0;i<n;i++)
	
{
	    
a[i]=s.nextInt();
	
}
    
sno=s.nextInt();
    
int r=Arrays.binarySearch(a,sno);
    
if(r<0)
    
{
        
System.out.println("Searching element is not found");
    
}
    
else
{
        
System.out.println("Element is found at\n position= " 
  +(r+1));
    
}
	
}

}
