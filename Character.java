import java.util.*;

public class Character

{
	
public static void main(String[] args) 
	
{
	
Scanner s=new Scanner(System.in);
	   
char a;
		
System.out.println("Enter the Character for a:");
		a=s.next().charAt(0);
		
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		
{
		     
System.out.println("Character is Vowel");
		    }
		    
else
		    
{
		    
System.out.println("Character is Consonent");
		}
		
		
}

}
