package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class File3 {
public static void main(String[] args) {
	File file= new File("d:/Q Spider data/pranay1.txt");
	
	try {
		if (file.exists()) {
			System.out.println("Already exixts");
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			fileOutputStream.write(20);
			System.out.println("Data written succesfully");
			fileOutputStream.close();
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
