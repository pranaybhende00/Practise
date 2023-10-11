package multithreading.two;

public class Wife extends Thread {
Account acc;

public Wife(Account acc) {
	this.acc = acc;
}
@Override
	public void run() {
		acc.deposite(2000);
		acc.withdarw(100);
	}

}
