import java.util.*;

public class TransposeMatrix

{
	
public static void main(String[] args) 
	
{
		
int a[][],i,j,m,n;
		 
Scanner s=new Scanner(System.in);
		 
System.out.println("Enter no.of rows nd columns");
		 
m=s.nextInt();
		 
n=s.nextInt();
		 
a=new int[m][n];
		 
System.out.println("Enter elements");
		 
for(i=0;i<m;i++)
		 
{
		     
for(j=0;j<n;j++)
		     
{
		         
a[i][j]=s.nextInt();
		     
}
		 }
		  
System.out.println(" Transpose Matrix is:");
		 
for(i=0;i<n;i++)
		 
{
		     
for(j=0;j<m;j++)
		     
{
		         
System.out.print(a[j][i]+" ");
		     
}  
		      
System.out.println();
		 
}
	
}

}
		 
		 
		 