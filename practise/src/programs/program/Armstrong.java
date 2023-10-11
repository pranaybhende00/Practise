package programs.program;
import java.util.*;
public class Armstrong 
{	
public static void main(String[] args) 
{
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter any number");
	int num=scanner.nextInt();
	int res=digit(num);
	
	if (res==num) 
	{
		System.out.println("Armstrong number");
	}
	else 
	{
		System.out.println("Not Armstrong number");
	}	
}
public static int check(int value,int count) 
{
	int mul=1;
	for(;count>0;count--) 
	{
		mul=mul*value;
	}
	return mul;
}
public static int digit(int num) 
{
	int n=num;
	int count=0;
	int res;
	int finalvalue=0;
	int a;
	while(n>0) 
	{
		count++;
		n=n/10;
	}
	while(num>0) 
	{
		a=num%10;
		res=check(a,count);
		finalvalue +=res;
		num=num/10;
	}
	return finalvalue;
}
}
