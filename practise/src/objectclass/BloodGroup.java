package objectclass;

public class BloodGroup {
	String person_name;
	String BloodType;
	BloodGroup(String name,String type){
		this.person_name=name;
		this.BloodType=type;
	}
	public boolean equals(Object var) {
		boolean demo=false;
		if(this.BloodType==((BloodGroup)var).BloodType) {
			demo=true;
		}
		return demo;
	}
public static void main(String[] args) {
	BloodGroup group=new BloodGroup("Pranay","O+");
	BloodGroup group2=new BloodGroup("Abhi","O+");
	System.out.println(group.equals(group2));
}
}
