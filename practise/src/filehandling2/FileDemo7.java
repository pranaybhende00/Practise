package filehandling2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileDemo7 {
public static void main(String[] args) {
	File file = new File("D:\\\\Q Spider data\\\\Eclipse Practise\\Student.txt");
	try {
		if (file.exists()) {
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(new Student(1,"ram","ram@gmail.com",25));
			System.out.println("Data converted");
			fileOutputStream.close();
			objectOutputStream.close();
		}
		else {
			file.createNewFile();
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(new Student(1,"ram","ram@gmail.com",25));
			System.out.println("Data converted from else");
			fileOutputStream.close();
			objectOutputStream.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
