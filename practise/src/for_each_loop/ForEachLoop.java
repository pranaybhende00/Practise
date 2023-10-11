package for_each_loop;

import java.util.ArrayList;

public class ForEachLoop {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(true);
	a1.add(123);
	a1.add('a');
	//Advance for loop
	for(Object obj:a1) {
		System.out.println(obj);
	}
	
}

}
