package multithreading.three;

public class MyThread3 extends Thread{
@Override
public void run() {
	System.out.println("Thread is running 1 "+ this.getName());
	System.out.println("Thread is running 1 "+this.getPriority());
	System.out.println("Thread is running "+currentThread().getName());
}
}
