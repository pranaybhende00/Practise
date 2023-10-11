package objectclass;
import java.util.Scanner;
public class Strong {
public static void main(String[] args) {
	
	int num =145;
	int n=num;
	int a;
	int sum =0;
	while(n>0) {
		int mul=1;
		a=n%10;
		for(int i=1;i<=a;i++) {
		mul=mul*i;
		}
		sum=sum+mul;
		n=n/10;
	}
	if (sum==num) {
		System.out.println("strong number");
	}
	else {
		System.out.println("not strong");
	}
}
}
