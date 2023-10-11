package objectclass;

public class Leap {
public static void main(String[] args) {
	int year=2000;
	
	if(year%4==0) {
		if (year%100==0) {
			if (year%400==0) {
				System.out.println("leap year");
			}
			else {
				System.out.println("not leap");
			}
			
		}
		else {
			System.out.println("leap");}
	}
	else
		System.out.println("not leap");
}
}
