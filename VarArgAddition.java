class Addition

{
    
void add(int...a)
   
 {
        
int sum=0;
        
for(int i=0;i<a.length;i++)
        
{
            
sum=sum+a[i];
        
}
        
System.out.println(sum);
    
}

}

public class VarArgAddition
{
	
public static void main(String[] args) 
{
	     
Addition a1=new Addition(); 
		
a1.add(45,6,22,3);
		
a1.add();
		
a1.add(21,76,986);
		
a1.add(5,6,5);
		
	
}


}

