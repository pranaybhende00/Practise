package multithreading.two;

public class Account {
double acc_b;

public Account(double acc_b) {
	this.acc_b = acc_b;
}
public double check_b() {
	return acc_b;
}
public synchronized void deposite(double amount) {
	this.acc_b=this.acc_b+amount;
	System.out.println("deposited "+amount+" succesfully");
	System.out.println("current balance is "+check_b());
}
public synchronized void withdarw(double amount) {
	this.acc_b=this.acc_b-amount;
	System.out.println("withdraw "+amount+" succesfully");
	System.out.println("current balance is "+check_b());
}

}
