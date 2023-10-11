package designpatterns2.adapter;

public class IphoneMain {
public static void main(String[] args) {
	Adapter adapter = new Adapter();
	adapter.androidCharger(adapter);
	adapter.iphoneCharger(adapter);
}
}
