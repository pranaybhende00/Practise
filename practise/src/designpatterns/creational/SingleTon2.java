package designpatterns.creational;

public class SingleTon2 {
private static SingleTon2 singleTon2= new SingleTon2();
private SingleTon2() {
	
}
public static SingleTon2 getObject() {
		
	return singleTon2;
}
}
