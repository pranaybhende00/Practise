package designpatterns2.adapter;

public class Iphone  {
	String charger;
public void isCharging(Adapter adapter,String charger) {
	this.charger=charger;
	System.out.println("Charging by "+this.charger+" charger");
}
}
