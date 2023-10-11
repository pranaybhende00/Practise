package objectclass;

public class Car {
	String cname;
	int cnumber;
	Car(String name,int number){
		this.cname=name;
		this.cnumber=number;
	}
	public String toString() {
		return "MH-40-Ae"+this.cnumber;
	}
	
public static void main(String[] args) {
	Car car=new Car("Swift",1523);
	System.out.println(car);
}
}
