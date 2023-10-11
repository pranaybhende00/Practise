package designpatterns2.factory;
import java.util.*;
public class Showroom {
	private static Cars car;
	public static Cars getInput(int input) {
		
		switch(input)
		{
		case 1:{
			car=new Suv();
			break;
		}
		case 2:{
			car=new Cidan();
			break;
		}
		default:{
			System.out.println("Invaid input");
		}
		}
		return car;
	}
public static void main(String[] args) {
	System.out.println("Enter input");
	Scanner scanner= new Scanner(System.in);
	int input=scanner.nextInt();
	try {
		car=Showroom.getInput(input);
		car.airBags();
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
	
	
}
}
