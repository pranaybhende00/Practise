package multithreading.one;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		start();
	}
	@Override
	public void run() {
		System.out.println(getName()+ " strtd");
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println(getName()+ " exec # "+i );
			}
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(getName()+" err "+ e);
		}
		System.out.println(getName()+" over");
	}
}