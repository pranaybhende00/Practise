package pdfMcq;

public class ThreadExtended extends Thread {
@Override
public void run() {
	System.out.println("\n Thread is running now\n");
}
public static void main(String[] args) {
	ThreadExtended threadE= new ThreadExtended();
	threadE.start();
}
}
