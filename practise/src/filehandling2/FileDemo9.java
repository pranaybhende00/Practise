package filehandling2;

public class FileDemo9 {

	private static FileDemo9 fileDemo9;
	private FileDemo9() {
		System.out.println("Const access");
	}
	public static FileDemo9 getObject() {
		if(fileDemo9==null) {
			fileDemo9=new FileDemo9();
		}
		return fileDemo9;
	}

}
