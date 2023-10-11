package filehandling2;

import java.io.File;
import java.io.FileWriter;

public class FileDemo5 {
public static void main(String [] args) {
	File file = new File("D:\\Q Spider data\\Eclipse Practise\\Demo.txt");
	try {
		if (file.exists()) {
			FileWriter fileWriter= new FileWriter(file);
			fileWriter.write("Data written by pranay");
			System.out.println("Data written succesfully");
			fileWriter.close();
		}
		else {
			file.createNewFile();
			FileWriter fileWriter= new FileWriter(file);
			fileWriter.write("Dtat ele written");
			System.out.println("Data written");
			fileWriter.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
