package designpatterns.adaptor;

public class AndroidCharger implements Charger {
	@Override
	public void charge(Adapter adapter) {
		String type="Android charger";
		adapter.charging(adapter,type);
	}

}
