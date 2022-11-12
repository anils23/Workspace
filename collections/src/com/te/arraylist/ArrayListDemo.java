package com.te.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
	ArrayList<Object> arrayList = new ArrayList<>();
	arrayList.add("abc");
	arrayList.add(123);
	arrayList.add(true);
	arrayList.add('a');
	
	System.out.println("==============Using for loop");
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	}
	
	System.out.println("==============Using advance loop");
	for (Object object : arrayList) {
		System.out.println(object);
	}
	
	System.out.println("==============Using Iterator");
	Iterator<Object> iterator = arrayList.iterator();
	while (iterator.hasNext()) {
        System.out.println(iterator.next());		
	}
	
	System.out.println(arrayList);
	
	
	}

}
