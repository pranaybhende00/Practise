package filehandling2;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private String email;
	private int age;
	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String toString() {
		return "Student id: "+this.id+"\n Student name: "+this.name+"\n Student email: "+this.email+"\n age: "+this.age;
	}

}
