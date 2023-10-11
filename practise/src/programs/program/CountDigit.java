package programs.program;
import java.util.*;
public class CountDigit 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Give one input");
	String str= scanner.next();
	int count=0;
	for (int i = 0; i < str.length(); i++) 
	{
		if (str.charAt(i)>=48&&str.charAt(i)<=57) 
		{
			count++;
		}
	}
	System.out.println("Count of digit is "+count);
}
}
