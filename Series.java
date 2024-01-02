import java.util.*;
class Series
/* 0 1 3 6 10 15.......n printing this series/*
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
	
int i,n,r=0;
	
n=s.nextInt();
	
for(i=1;i<=n;i++)
	
{
	   	
System.out.println(r+ " ");
	    	
r=r+i;
	
}
}
}