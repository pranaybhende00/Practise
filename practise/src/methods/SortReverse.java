package methods;

import java.util.ArrayList;
import java.util.Collections;

public class SortReverse {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(1);
	a1.add(3);
	a1.add(2);
	Collections.sort(a1);
	//Advance for loop
	for(Integer obj:a1) {
		System.out.println(obj);
	}
	Collections.reverse(a1);
	for(Integer obj:a1) {
		System.out.println(obj);
	}
}
}
