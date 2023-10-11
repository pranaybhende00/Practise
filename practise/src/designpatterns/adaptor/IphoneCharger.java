package designpatterns.adaptor;

public class IphoneCharger implements Charger {

	@Override
	public void charge(Adapter adapter) {
		String type ="Iphone charger";
		adapter.charging(adapter,type);
	}

}
