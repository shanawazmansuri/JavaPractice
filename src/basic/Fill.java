package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fill {

	public static void main(String[] args) throws IOException {
		
		//File Creation
		
		String srcPath = "C:\\Users\\Admin\\Desktop\\Noor.txt"; 
		File fl = new File(srcPath);
		
		if(!fl.exists())
		{			fl.createNewFile();
			System.out.println("File created successfully");


		}
		else
		{
			System.out.println("File already exists");
		}
		
		System.out.println(fl.getAbsolutePath());
		System.out.println(fl.canRead());
		System.out.println(fl.canWrite());
		System.out.println(fl.exists());
		System.out.println(fl.length());
		
		
		//File Output stream
		
/*      FileOutputStream fo = new FileOutputStream(srcPath);
		String content = "Noor Fatima";
		fo.write(content.getBytes());
		fo.close();*/
		
		
		//FileWriter
		FileWriter fw = new FileWriter(srcPath);
		String con = "Noor Fatima is a Good Girl";
		/*
		  char[] ch = new char[2]; ch[0] = 'A'; ch[1] = 'M';*/
		 
		fw.write(con);
		fw.close();
		
		
		
		//File InputStream
		FileInputStream fi = new FileInputStream(srcPath);
		int i = fi.read();
		while(i!=-1)
		{
			
			System.out.print((char)i);
			i = fi.read();
			
		}
		
		//FileReader
		
		FileReader fr = new FileReader(srcPath);
		int read = fr.read();
		while(read!=-1)
		{
			System.out.print((char)read);
			
			read = fr.read();
		}
		
		//Buffer Writer
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(srcPath,true));
		bw.write("Yoyo");
		bw.close();
		
		
		
		//Buffer Reader
		
		BufferedReader br = new BufferedReader(new FileReader(srcPath));
		int a = br.read();
		while(a!=-1)
		{
			System.out.println((char)a);
			
			a = br.read();
		}
	
		
		
		
		

	}

}
