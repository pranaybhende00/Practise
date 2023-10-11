package exception;

import java.io.IOException;

public class Check2 extends Check {
public void show() {
	System.out.println("Check2");
}
public static void main(String[] args) {
	Check2 check2 = new Check2();
	check2.show();
}

}
