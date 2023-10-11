package programs.program;
import java.util.*;
public class PrimeArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of the array");
	int size=sc.nextInt();
	int [] arr= new int[size];
	System.out.println("Enter value of the array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {	
		int count=0;
		for(int j=1;j<=arr[i];j++) {
			if (arr[i]%j==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("prime numbers are "+arr[i]);
		}
		else {
			System.err.println("Not prime numbers are "+arr[i]);
		}
	}	
}
}
