package array.practise;

import java.util.Scanner;

public class Maxi {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	System.out.println("enter size of array");
	
	int [] arr= new int[input];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("enter number");
		arr[i]=scanner.nextInt();
	}
	
	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]<min) {
			min=arr[i];
		}
		
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(min+"minimum value");
	System.out.println(max+"maximun value");
	}
}
