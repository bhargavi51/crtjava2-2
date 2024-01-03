import java.util.*;

public class DiagnolSum
{
	
public static void main(String[] args) 
	
{
		
int a[][],i,j,m,n,sum=0;
		 
Scanner s=new Scanner(System.in);
		 
System.out.println("Enter no.of rows nd columns");
		 
n=s.nextInt();
		 
a=new int[n][n];
		 
System.out.println("Enter elements");
		 
for(i=0;i<n;i++)
		 
{
		     
for(j=0;j<n;j++)
		     
{
		         
a[i][j]=s.nextInt();
		     
}
		 
}
		 
for(i=0;i<n;i++)
		 
{
		     
for(j=0;j<n;j++)
		     
{
		        
if(i==j)
		        
{
		            
sum=sum+a[i][j];
		        
}
		     
}  
		 
}
		 
System.out.println("sum of elements is:"+sum);
	
}

}
		 
		 
		 
	