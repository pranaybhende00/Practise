package programs.program;
import java.util.*;
public class LargestNumberArray 
{
public static void main(String[] args) 
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Size of the array");
	int size=scanner.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) 
	{
		arr[i]=scanner.nextInt();
	}
	int max=arr[0];
	for (int i = 0; i < arr.length; i++) 
	{
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Minimum value is "+max);
}
}
