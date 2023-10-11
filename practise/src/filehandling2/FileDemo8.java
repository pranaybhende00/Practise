package filehandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDemo8 {
public static void main(String[] args) {
	File file = new File("D:\\\\Q Spider data\\\\Eclipse Practise\\Student.txt");
	try {
		if (file.exists()) {
			FileInputStream fileInputStream= new FileInputStream(file);
			ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
			Student student = (Student)objectInputStream.readObject();
			System.out.println(student);
			fileInputStream.close();
			objectInputStream.close();
		}
		else {
			file.createNewFile();
			FileInputStream fileInputStream= new FileInputStream(file);
			ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
			objectInputStream.readObject();
			System.out.println("Data fetched from else");
			fileInputStream.close();
			objectInputStream.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
