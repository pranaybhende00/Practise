package programs.program;
import java.util.*;
public class LeapYear
{
public static void main(String[] args) 
{
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the year");
	int year=scanner.nextInt();
	
	if (year%4==0) 
	{
		if (year%100==0) 
		{
			if (year%400==0) 
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not leap");
			}
		}
		else 
		{
			System.out.println("Leap");
		}
		}
	else 
	{
		System.out.println("Not leap year");
	}
	}
}

