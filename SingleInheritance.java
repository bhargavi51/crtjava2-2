class Student

{
    
int admno;
    
String name;
    
void get(int admno,String name)
    
{
        
this.admno=admno;
        
this.name=name;
    
}
    
void show()
    
{
        
System.out.println("Admission No="+admno);
        
System.out.println("Name="+name);
    
}

}    
    
class Marks extends Student
    
{
        
int mat,phy,che;
        
void getMarks(int mat,int phy,int che)
    
{
        
this.mat=mat;
        
this.phy=phy;
        
this.che=che;
    
}
    
void showMarks()
    
{
        
System.out.println("Maths="+mat); 
        
System.out.println("Physics="+phy); 
        
System.out.println("Chemistry="+che); 
        
System.out.println("Total="+(mat+phy+che)); 
        
System.out.println("Average="+(mat+phy+che)/3); 
    
}
    

}

public class  SingleInheritance
{
	
public static void main(String[] args) 
{                                                    
	   
Marks m1=new Marks();
	   
m1.get(111,"rrr");
	   
m1.getMarks(88,42,43);
	   
m1.show();
	   
m1.showMarks();
	
}

}

