package objectclass;

public class PinCode {
	String areaname;
	int Pincode;
	PinCode(String aname,int pin){
		this.areaname=aname;
		this.Pincode=pin;
	}
	public int hashCode() {
		return this.Pincode;
	}
public static void main(String[] args) {
	PinCode pincode =new PinCode("Thergaon",411033);
	System.out.println(pincode.hashCode());
}
}
