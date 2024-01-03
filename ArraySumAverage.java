import java.util.*;

public class ArraySumAvg
{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	
int a[],i,n,sum=0;
	
float avg;
	
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
	    
sum=sum+a[i];
	    
}
	
avg=(float)sum/n;
	
System.out.println("sum of Elements: " +sum);
	System.out.print("Average:" +avg);
	
}

}
