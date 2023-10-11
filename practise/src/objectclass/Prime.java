package objectclass;

public class Prime {
public static void main(String[] args) {
	//int num=9;
	
	int count1=0;
	for(int j=1;j<100;j++) {
		int count =0;
	for(int i =1;i<=j;i++) {
		if(j%i==0) {
			count++;
		}
	}
	if (count==2) {
		count1++;
	}
	
}
	System.out.println("count is "+count1);
	}
}
