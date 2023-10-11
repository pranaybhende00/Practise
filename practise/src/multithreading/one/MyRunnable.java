package multithreading.one;
import static java.lang.Thread.*;
public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+ " strtd");
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println(currentThread().getName()+ " exec # "+i );
			}
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(currentThread().getName()+" err "+ e);
		}
		System.out.println(currentThread().getName()+" over");
	}
}