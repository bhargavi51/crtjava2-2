import java.util.Scanner;
class LastIndexOf
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    String s1="learning java is very easy";
		System.out.println(s1);
		System.out.println(s1.replace("easy","difficult"));
		System.out.println(s1.IndexOf("Java"));
		System.out.println(s1.IndexOf("e"));
		System.out.println(s1.lastIndexOf("e"));
	}
}

