package com.jspiders.File.Examples;

import java.io.File;

public class CreateFolder {
	
	public static void main(String[] args) {
		
		
		File f=new File("C:\\Users\\91750\\Desktop\\Task\\Folder1\\Folder2");
		
		if (f.exists()==true) {
			System.out.println("Folder already exists");
		} else {
			f.mkdir();
			System.out.println("Folder created");
		}
		
		
		
	}

}
