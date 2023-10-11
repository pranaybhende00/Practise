package designpatterns2.builder;

public class Car {
private String name;
private String company;
private String model;
private long price;

public Car(String name,String company,String model,long price) {
	this.name=name;
	this.company=company;
	this.model=model;
	this.price=price;
}
public String toString() {
	return " Name: "+this.name+"\n Company: "+this.company+"\n model: "+this.model+"\n price: "+this.price;
}
}
