package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class WriteDataInFileAndReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// write Data using FileOutputStream
		/*FileOutputStream fi2= new FileOutputStream("D:\\JavaFile\\java.txt");
		String s= "Hi how are u doing good";
		byte[] g=s.getBytes();
		fi2.write(g);
		String h= "good morning ";
		byte[] j=h.getBytes();
		fi2.write(g);
		fi2.flush();
		fi2.close();
		*/
		// write Data using PrintStream
		
		
		/*FileInputStream fi3= new FileInputStream("D:\\JavaFile\\java.txt");
		int data= fi3.read();
		while (data!=-1) {
			System.out.print((char)data);
			data=fi3.read();
			
		}
		fi3.close();*/
		
		PrintStream fi2=new PrintStream("D:\\JavaFile\\java1.txt");
		String s= "Hi how are u doing good";
		fi2.println(s);
		String h= "good morning ";
		fi2.println(h);
		
		FileInputStream fi3= new FileInputStream("D:\\JavaFile\\java1.txt");
		int data= fi3.read();
		while (data!=-1) {
			System.out.print((char)data);
			data=fi3.read();
			
		}
		fi3.close();
		
		
       
	}

}
