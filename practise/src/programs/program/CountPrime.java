package programs.program;
import java.util.*;
public class CountPrime
{
public static void main(String[] args)
{
	Scanner scanner= new Scanner(System.in);
	
	System.out.println("Enter lower limt");
	int start=scanner.nextInt();
	
	System.out.println("Enter last limit");
	int end=scanner.nextInt();
	
	int countprime=0;
	for(int i=start;i<=end;i++) 
	{
		int count=0;
		for(int j=1;j<=i;j++) 
		{
			if (i%j==0) 
			{
				count++;
			}
		}
		if (count==2) 
		{
			countprime++;
		}
	}
	System.out.println("Count of prime number from "+start+" to "+end+" is "+countprime);
}
}
