package objectclass;


public class CountDigit {
public static void main(String[] args) {
	String str="A1B2C3D4";
	int count =0;
	
	for(int i = 0;i<str.length();i++) {
		if (str.charAt(i)>=48 && str.charAt(i)<=57) {
			count++;
		}
	}
	System.out.println(count);
}
}
