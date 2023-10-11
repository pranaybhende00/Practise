package programs.program;
import java.util.*;
public class Duplicate
{
public static void main(String[] args) 
{
	int arr[]= {1,2,3,4,5};
	boolean b=false;
	for (int i = 0; i < arr.length-1; i++)
	{
		if (arr[i]==arr[i+1]) 
		{
			b=true;
		}
	}
	System.out.println(b);
}
}
