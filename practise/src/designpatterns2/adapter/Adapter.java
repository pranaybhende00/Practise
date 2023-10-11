package designpatterns2.adapter;

public class Adapter extends Iphone implements Charger  {
	
public void iphoneCharger(Adapter adapter) {
	String charger="Iphone";
	adapter.isCharging(adapter,charger);
}
public void androidCharger(Adapter adapter) {
	String charger="Android";
	adapter.isCharging(adapter,charger);
}
}
