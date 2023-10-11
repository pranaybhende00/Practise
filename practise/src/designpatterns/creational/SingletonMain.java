package designpatterns.creational;

public class SingletonMain {
public static void main(String[] args) {
	SingleTon singleTon=SingleTon.getObject();
	System.out.println(singleTon);
	
	SingleTon singleTon1=SingleTon.getObject();
	System.out.println(singleTon1);
	
	SingleTon2 singleTon2= SingleTon2.getObject();
	System.out.println(singleTon2);
	
	SingleTon2 singleTon3= SingleTon2.getObject();
	System.out.println(singleTon3);
}
}
