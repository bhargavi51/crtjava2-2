import java.util.*;

public class Prime1

{
	
public static void main(String[] args) 
{
		
Scanner s=new Scanner(System.in);
         
int i,n;
         
n=s.nextInt();
          
for(i=2;i<=n;i++)
          
{
         
         
if(n%i==0)
         
break; 
          
}
        
if(i==n)
        
System.out.println("Prime number");
        
else
       
System.out.println(" Not a Prime number");

}

}
