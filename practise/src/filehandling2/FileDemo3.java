package filehandling2;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
public static void main(String[] args) {
	File file = new File("Demo.txt");
	try {
		if(file.exists()) {
			file.delete();
			System.out.println("File deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File created");
		}
		}
	catch(IOException e) {}
	
	}
}
