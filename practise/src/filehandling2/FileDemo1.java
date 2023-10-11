package filehandling2;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
public static void main(String[] args) {
	File file = new File("Demo.txt");
	try
	{
		file.createNewFile();
		System.out.println("File is created");
	}
	catch(IOException e) {
		System.out.println("File not found");
	}
}
}
