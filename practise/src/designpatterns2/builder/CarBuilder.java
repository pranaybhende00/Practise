package designpatterns2.builder;

public class CarBuilder {
private String name;
private String company;
private String model;
private long price;
public CarBuilder carName(String name) {
	this.name=name;
	return this;
}
public CarBuilder carCompany(String company) {
	this.company=company;
	return this;			
	}
public CarBuilder carModel(String model) {
	this.model=model;
	return this;
}
public CarBuilder carPrice(long price) {
	this.price= price;
	return this;
}
public Car getCar() {
	Car car= new Car(name,company,model,price);
	return car;
}
}
