package programs.program;
import java.util.*;
public class ReverseString 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any String");
	String str=scanner.next();
	String rev="";
	 for (int i = str.length()-1;i>=0 ; i--) 
	 {
		rev +=str.charAt(i);
	 }
	 System.out.println(rev);
}
}
