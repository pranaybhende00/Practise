package pdfMcq;

public class Student implements StudentInfo,StudentMarks {

	@Override
	public void displayMarks() {
		System.out.println("M3 marks "+m3);
		System.out.println("Oop marks "+oop);
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Rollno "+rollno);
		System.out.println("name "+name);
	}

}
