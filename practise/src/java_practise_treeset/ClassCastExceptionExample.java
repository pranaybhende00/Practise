package java_practise_treeset;
import java.util.TreeSet;
public class ClassCastExceptionExample {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(123);
	try {
		ts.add("hello");
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println(ts);
	
}
}
