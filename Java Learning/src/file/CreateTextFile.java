package file;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fi= new File("D:\\JavaFile//java.txt");
		fi.createNewFile();
		System.out.println(fi.exists());
		System.out.println(fi.canRead());
		System.out.println(fi.canWrite());
		System.out.println(fi.getAbsolutePath());

	}

}
