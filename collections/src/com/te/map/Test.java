package com.te.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "amit");
		hashMap.put(2, "amir");
		hashMap.put(3, "Something");
		hashMap.put(4, "rakesh");
		hashMap.put(5, "aman");

//		Set<Integer> keySet = hashMap.keySet();
//		Iterator<Integer> iterator = keySet.iterator();
//		while (iterator.hasNext()) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer + "::" + hashMap.get(integer));
//		}

		ArrayList<Object> arrayList = new ArrayList<>();
		for (int i = 0; i < hashMap.size(); i++) {
			arrayList.add(hashMap.get(i));
		}
		
		System.out.println(arrayList);

	}

}
