import java.util.*;

public class Prime
/* printing the given number is prime or not*/

{
	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
int i,n,c=0;

n=s.nextInt();
	
for(i=1;i<=n;i++)
	
{
	    	
	    	
if(n%i==0)
	    	
c=c+1;
	
}
      
if(c==2)
        
System.out.println(n+" is a prime ");
    
else
        
System.out.println(n+" is not a prime");
	
}

}
