package filehandling2;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
public static void main(String[] args) {
	File file= new File("Demo.txt");
	try {
		if(file.exists()) {
			System.out.println("File is already there");
		}
		else {
			file.createNewFile();
			System.out.println("File created ");
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
