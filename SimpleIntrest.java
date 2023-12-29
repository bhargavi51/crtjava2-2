import java.lang.Scanner.*;
class SimpleIntrest
{
public static void main(String args[])
{
/* Program to clculate Simple intrest by using the 
 formula PTR/100*/
 
Scanner s=new Scanner(System .in);  double P,T,R,S;
  
  System.out.println("Enter the amount to calculate the simple intrest");
    P=s.nextInt();
   
 T=s.nextInt();
    
R=s.nextInt();
    
S=(P*T*R)/100;
    
System.out.println("Simple intrest is :" +S);
}
}