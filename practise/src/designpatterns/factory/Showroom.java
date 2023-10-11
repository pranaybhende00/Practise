package designpatterns.factory;

import java.util.Scanner;

public class Showroom {
	private static Cars car;
public static Cars getCar(int input) {
	switch (input) {
	case 1:{
		car=new Suv();
		break;
	}
	case 2:{
		car=new Cidan();
		break;
	}
	default:
		System.out.println("Select correct input");
		break;
	}
	return car;
}
public static void main(String[] args) {
	System.out.println("Select input \n 1-for Suv \n 2-for Cidan");
	Scanner sc = new Scanner(System.in);
	int input=sc.nextInt();
	getCar(input).price();
}
}

