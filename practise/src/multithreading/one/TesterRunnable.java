package multithreading.one;
import static java.lang.Thread.*;
public class TesterRunnable {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Main thrd details "+currentThread()); //main thread
	
	MyRunnable myRunnable= new MyRunnable();
	Thread thread1= new Thread(myRunnable,"one");
	Thread thread2= new Thread(myRunnable,"two");

	thread1.start();
	thread2.start();
	
	for (int i = 0; i < 2; i++) {
		System.out.println(currentThread().getName()+" exec # "+i);
		Thread.sleep(500);
	}
	System.out.println(thread1.isAlive()+" "+thread2.isAlive());
	System.out.println("Main over");
}
}

