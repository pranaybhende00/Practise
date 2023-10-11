package multithreading.three;

public class Main3 {
public static void main(String[] args) {
	MyThread3 myThread3 = new MyThread3();
	System.out.println("main started");
	Thread thread= new Thread(myThread3);
	myThread3.setName("Pranay");
	myThread3.setPriority(3); 
	myThread3.start();
	System.out.println("Main over");
}
}
