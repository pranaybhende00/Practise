package multithreading.three;

class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread 1 is running 1st");
		System.out.println("Thread 1 is running 2nd");

	}
}
