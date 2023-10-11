package programs.program;
import java.util.*;
public class Summation 
{
public static void main(String[] args) 
{
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter one input");
	String str= scanner.next();
	int res=0;
	for (int i = 0; i < str.length(); i++) 
	{
		if (str.charAt(i)>=48&&str.charAt(i)<=57) 
		{
			res=res+str.charAt(i)-48;
		}
	}
	System.out.println("Summation is "+res);	
}
}
