package filehandling2;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
public static void main(String[] args) {
	File file = new File("Demo.txt");
	try {
		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
		}
		else {
			file.createNewFile();
			System.out.println("File created");
		}
	}
	catch(IOException e) {
		
	}
}
}
