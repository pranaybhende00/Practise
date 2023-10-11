package multithreading.two;

public class AccMain {
public synchronized static void main(String[] args) {
	Account acc= new Account(5000);
	Husband h= new Husband(acc);
	Wife w= new Wife(acc);
	
	h.start();
	w.start();
}
}
