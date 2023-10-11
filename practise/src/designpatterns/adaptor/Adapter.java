package designpatterns.adaptor;

public class Adapter extends Iphone  {
	Charger charger;
	Adapter(Charger charger){	
		this.charger=charger;
	}
	
	public void charge(Adapter adapter) {
		charger.charge(adapter);
	}
	
}
