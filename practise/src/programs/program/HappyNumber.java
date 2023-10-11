package programs.program;
import java.util.*;
public class HappyNumber 
{
public static int check(int number) 
{
	int a;
	int sum=0;
	while (number>0) 
	{
	a=number%10;
	sum +=a*a;
	number=number/10;		
	}
	return sum ;	
	}

 public static void main(String[] args) 
 {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter any number");
	int number=scanner.nextInt();
	
	while(number !=1 && number !=4) 
	{
		number=HappyNumber.check(number);
	}
	if(number==1) 
	{
		System.out.println("Happy number");
	}
	else 
	{
		System.out.println("Not Happy number");
	}
	}	
}

