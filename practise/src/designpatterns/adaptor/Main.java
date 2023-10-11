package designpatterns.adaptor;

public class Main {
public static void main(String[] args) {
	//Iphone iphone = new Iphone();
	Charger charger=new AndroidCharger();
	Adapter adapter= new Adapter(charger);
	adapter.charge(adapter);
}
}
