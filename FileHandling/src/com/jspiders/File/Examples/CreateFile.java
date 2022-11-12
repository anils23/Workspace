package com.jspiders.File.Examples;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\91750\\Desktop\\Task\\Folder1\\Folder2\\java.xlsx");
		
		if (f.exists()==true) {
			System.out.println("File already created");
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File created");
		}
	
	}

}
