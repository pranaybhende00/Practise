package designpatterns.creational;

public class SingleTon {
	private static SingleTon singleTon;
	
	public static SingleTon getObject() {
		if (singleTon==null) {
			 singleTon= new SingleTon();
		}	
		return singleTon;
	}
}
