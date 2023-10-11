package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class File5 {
public static void main(String[] args) {
	File file= new File("d:/Q Spider data/pranay1.txt");
	
	try {
		if (file.exists()) {
			System.out.println("Already exixts");
			FileInputStream fileInputStream= new FileInputStream(file);
			
			System.out.println(fileInputStream.read());
			fileInputStream.close();
		}
		else {
			file.createNewFile();
			FileInputStream fileInputStream= new FileInputStream(file);
			fileInputStream.read();
			System.out.println("Data written succesfully");
			fileInputStream.close();
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
