package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHand {

	public static void main(String[] args) throws IOException {

		// Dealing with reading and writing data into file
		// Creating new File
		String loc = "C:\\Users\\Admin\\Desktop\\Test.txt";
		File fl = new File(loc);

		if (!fl.exists()) {
			fl.createNewFile();
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File Aleady Exists");
		}

		/*
		 * System.out.println(fl.canRead()); System.out.println(fl.canWrite());
		 * System.out.println(fl.getAbsolutePath()); System.out.println(fl.exists());
		 * System.out.println(fl.length()); //System.out.println(fl.delete());
		 */

		// File Write
		// FileWriter Class supports Character Code
		// By default append value is set as false

		FileWriter fw = new FileWriter(loc, true);
		String content = "Welcome to Java File";
		// char [] cha = {'A','B'};
		fw.write(content);
		fw.close();

		// FileOutStream Class
		// FileOutputStream Class supports Byte Code

		FileOutputStream fos = new FileOutputStream(loc);
		String newCon = "WelCome to Program";
		// 010101 = Char
		fos.write(newCon.getBytes());
		fos.close();

		// FileReader
		// Char Code
		FileReader fr = new FileReader(loc);
		int a = fr.read();
		// int return
		// return end stream

		// 87
		// 92
		// 95
		// 101
		// 105

		/*
		 * while(!(a==-1)) { System.out.print((char)a);
		 * 
		 * //Increment value of a
		 * 
		 * a = fr.read(); //a = -1 }
		 */

		// FileIputStream
		// Byte Code

		FileInputStream fis = new FileInputStream(loc);
		int i = fis.read();
		while (!(i == -1)) {
			System.out.println((char) i);

			i = fis.read();
		}

		// BufferedReader
		// BufferedWriter

	}

}
