package programs.program;
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseArray 
{
public static void main(String[] args) 
{
	System.out.println("Enter Array size");
	 Scanner sc= new Scanner(System.in);
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 
	 for (int i = 0; i < arr.length; i++) 
	 {
		System.out.println("Enter value at index: "+i);
		arr[i]=sc.nextInt();
	 }
	 int emptyArray[]= new int[size];
	 int plus=0;
	 
	 for (int i = arr.length-1; i >= 0; i--) 
	 {
		 for (int j = 0; j < arr.length; j++) 
		 {
			 emptyArray[j+plus]=arr[i];			 
			 plus++;
			 break;
		 }	
	}	 
	System.out.println("Reverse Array is:");
	
	for (int i=0;i<emptyArray.length ;i++ )
	{
		 System.out.println(emptyArray[i]);
	}
}
}