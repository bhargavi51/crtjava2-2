class Student
{
     
int admno;
     
String name;
     
void get(int x,String y)
     
{
         
admno=x;
         
name=y;
     
}
     
void show()  
     
{
         
System.out.println("admno="+admno+ " Name=" +name);
     
}

}
     
     
class Test
     
{
	
public static void main(String[] args) 
	
{
	    
	   
Student s1=new Student();
	   
Student s2=new Student();
	    
s1.get(123,"ABC");
	    
s2.get(456,"DEF");
	    
s1.show();
	    
s2.show();
	
}

}
