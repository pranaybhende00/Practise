package programs.program;
import java.util.*;
public class ReverseInteger 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter one input");
	int num=scanner.nextInt();
	int res=0;
	int a;
	while(num>0) 
	{
		a=num%10;
		res= (res*10)+a;
		num=num/10;
	}
	System.out.println("Reverse integer is "+res);
}
}
