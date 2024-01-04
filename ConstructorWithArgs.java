public class ConstructorWithArgs

{  
   
int admno;
   
String name;
   
ConstructorWithArgs(int x,String y)
   
{
       
admno=x;
       
name=y;
   
}
   
void show()
   
{
       
System.out.println("admno="+admno+" name="+name);
   
}
	
public static void main(String[] args) 
	
{
	 
ConstructorWithArgs  s1=new ConstructorWithArgs(111,"ABC");
	 
s1.show();
	
	
}

}


