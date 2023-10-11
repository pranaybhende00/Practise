package methods;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMethods {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(true);
	a1.add(123);
	a1.add('a');
	Iterator obj=a1.iterator();//upcasting
	while(obj.hasNext()) {
		System.out.println(obj.next());
	}
}
}
