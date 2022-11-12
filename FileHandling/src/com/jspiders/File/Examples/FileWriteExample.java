package com.jspiders.File.Examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
	
	public static void main(String[] args) {
		
		String s="C:\\\\Users\\\\91750\\\\Desktop\\\\Task\\\\Folder1\\\\Folder2\\\\java.txt";
		
		File f = new File(s);
		FileWriter fw = null;
	     try {
		     fw=new FileWriter(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	     try {
			fw.write("hello world");
			fw.flush();
			System.out.println("data inserted");
		} catch (IOException e) {
			e.printStackTrace();
		}
	     
	     
	}

}
