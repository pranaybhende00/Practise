package filehandling2;

import java.io.File;
import java.io.FileOutputStream;

public class FileDemo6 {
public static void main(String[] args) {
	File file = new File("D:\\\\Q Spider data\\\\Eclipse Practise\\\\Demo.txt");
	try {
		if (file.exists()) {
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			fileOutputStream.write(500);;
			System.out.println("Data written");
			fileOutputStream.close();
		}
		else {
			file.createNewFile();
			FileOutputStream fileOutputStream= new FileOutputStream(file);
			fileOutputStream.write(500);;
			System.out.println("Dtaa added from else block");
			fileOutputStream.close();
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
