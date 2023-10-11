package objectclass;

public class Happy {
public static void main(String[] args) {
	int res=1;
	while(res !=1&& res!=4) {
		res=happy(res);
	}
	if(res==1) {
		System.out.println("happy number");
	}
	else {
		System.out.println("not happy");
	}
}
public static int happy(int n) {
	int a;
	int s=0;
	while(n>0) {
	a=n%10;
	s=s+a*a;
	n=n/10;
	}
	return s;
}
}
