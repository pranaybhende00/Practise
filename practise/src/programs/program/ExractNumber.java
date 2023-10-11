package programs.program;
import java.util.*;
public class ExractNumber 
{
public static void main(String[] args) 
{
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter one input");
	String str=scanner.next();
	String store="";
	for (int i = 0; i < str.length(); i++) 
	{
		if (str.charAt(i)>=48&&str.charAt(i)<=57) 
		{
			store+=str.charAt(i);
		}
	}
	System.out.println("Extract numbers are "+store);
}
}
