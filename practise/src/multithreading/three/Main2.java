package multithreading.three;

public class Main2 {
public static void main(String[] args) {
	MyThread2 myThread2 = new MyThread2();
	System.out.println("main started");
	Thread thread= new Thread(myThread2);
	thread.start();
	System.out.println("Main over");
}
}
//In this case their is no relation between MyThread2 class and Thread class we have
//to create object for thread class and the address of the MyThread2 class so we can access
//the start() method because the start method is member of Thread class and to start the 
//execution of thread start method is mandatory.
//After passing the address of MyThread2 class to Thread class Then Thread class behave like
//the MyThread2 class