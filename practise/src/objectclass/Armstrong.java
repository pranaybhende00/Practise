package objectclass;

public class Armstrong {
public static void main(String[] args) {
	int num = 371;
	int n=num;
	
	int res=arm(n);
	if (res==num) {
		System.out.println("arm");
	}
	else {
		System.out.println("not arm");
	}
	
	
}
public static int arm(int n) {
	int b=n;
	int a;
	int res =0;
	int count=0;
	while(b>0) {
		count++;
	}
	int value=0;
	while(n>0) {
		a=n%10;
		res=check(a,count);
		value +=res;
		n=n/10;
	}
	return value;
}
public static int check(int digit,int count) {
	int mul=1;
	while(count>0) {
		mul=mul*digit;
		count--;
	}
	return mul;
}
}
