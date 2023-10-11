package designpatterns2.builder;

public class CarMain {
public static void main(String[] args) {
	
	Car car = new CarBuilder().carName("Thar").carCompany("Mahendra").carModel("4x4").carPrice(1800000).getCar();
	System.out.println(car);
	
}
}
