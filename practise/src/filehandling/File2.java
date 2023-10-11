package filehandling;

import java.io.File;
import java.io.FileWriter;

public class File2 {
public static void main(String[] args) {
	File file= new File("d:/Q Spider data/pranay.txt");
	
	try {
		if (file.exists()) {
			System.out.println("Already exixts");
			FileWriter fileWriter= new FileWriter(file);
			fileWriter.write("My name is pranay");
			System.out.println("Data written succesfully");
			fileWriter.close();
		}
		else {
			file.createNewFile();
			FileWriter fileWriter= new FileWriter(file);
			fileWriter.write("My name is pranay");
			fileWriter.close();
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
