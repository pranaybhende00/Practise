package multithreading.one;
import static java.lang.Thread.*;
public class TesterThread {
public static void main(String[] args) throws InterruptedException {
	System.out.println("Main thrd details "+currentThread());
	MyThread mythread1= new MyThread("one");
	MyThread mythread2= new MyThread("two");
	
	for (int i = 0; i < 2; i++) {
		System.out.println(currentThread().getName()+" exe # "+i);
		Thread.sleep(1000);
	}
	System.out.println(mythread1.isAlive()+" "+mythread2.isAlive());
	System.out.println("Main over");
}
}

