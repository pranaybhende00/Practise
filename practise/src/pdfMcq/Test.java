package pdfMcq;

public class Test extends Thread {
public static void main(String[] args) {
	B b= new B();
	if(b instanceof A) {
		System.out.println("b is a instance of A");
	}
	if (b instanceof C) {
		System.out.println("b is a instance of C");
	}
}
}
