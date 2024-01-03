import java.util.*;

public class 2dArrayDynamic

{
	
public static void main(String[] args) 
	
{
		
int a[][]=new int[2][2];
		 
Scanner s=new Scanner(System.in);
		 
int i,j;
		 
System.out.println("Enter 4 elements");
		 
for(i=0;i<2;i++)
		 
{
		     
for(j=0;j<2;j++)
		     
{
		         
a[i][j]=s.nextInt();
		     
}
		 
}
		  
System.out.println("Matrix is:");
		 
for(i=0;i<2;i++)
		 
{
		     
for(j=0;j<2;j++)
		     
{
		         
System.out.print(a[i][j]+" ");
		     
}  
		      
System.out.println();
		 
}
	
}

}
		 
		 
		 
	