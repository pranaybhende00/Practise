package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File4 {
public static void main(String[] args) {
	File file= new File("d:/Q Spider data/pranay.txt");
	
	try {
		if (file.exists()) {
			System.out.println("Already exixts");
			FileReader fileReader= new FileReader(file);			
			System.out.println(fileReader.read());
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			fileReader.close();
		}
		else {
			System.out.println("File does not exists");
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
