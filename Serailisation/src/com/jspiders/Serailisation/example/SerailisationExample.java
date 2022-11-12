package com.jspiders.Serailisation.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailisationExample {
	
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\91750\\Desktop\\emp.ser";
		
		File f=new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileOutputStream fos=null;
	    ObjectOutputStream os=null;
	    Employee emp=new Employee("anil","anil07@gmail.com");
		
		try {
	           fos=new FileOutputStream(f);
	           os=new ObjectOutputStream(fos);     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    try {
			os.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    System.out.println("object is serailised");
	   
		
	}

}
