package multithreading.two;

public class Husband extends Thread {
	Account acc;
@Override
public void run() {
	acc.deposite(100);
	acc.withdarw(500);
}
public Husband(Account acc) {
	this.acc = acc;
}
}
