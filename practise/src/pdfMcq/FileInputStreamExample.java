package pdfMcq;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\Cdac data\\HANUMAN.jpg");
	FileInputStream fileInputStream = new FileInputStream(file);
	byte bytes[]= new byte[(int)file.length()];
	int numOfBytes= fileInputStream.read(bytes);
	System.out.println("data copied succesfully...");
	System.out.println(numOfBytes);
}
}
