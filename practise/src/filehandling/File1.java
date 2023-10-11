package filehandling;

import java.io.File;

public class File1 {
public static void main(String[] args) {
	File file = new File("d:/Q Spider data/Demo.txt");
	try {
		if (file.exists()) {
			System.out.println("File name:   "+file.getName());
			System.out.println("File path:   "+file.getAbsolutePath());
			System.out.println("File Read?:  "+file.canRead());
			System.out.println("File Write?: "+file.canWrite());
			System.out.println("File length: "+file.length());
			System.out.println("File delete: "+file.delete());
		}
		else {
			//file.createNewFile();
			System.out.println("File does not exists");
			file.createNewFile();
			System.out.println("New File created");
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}	
}
}
