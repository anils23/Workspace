package com.te.assingment.assingment;

import java.util.Arrays;
import java.util.Iterator;

public class MyArraylist {

	private Object[] array;
	private int index;

	public MyArraylist() {
		array = new Object[10];
	}

	@Override
	public String toString() {
		return "MyArraylist [array=" + Arrays.toString(array) + "]";
	}

	public int size() {
		return index;
	}

	public void add(Object obj) {
		if (index > array.length - 1) {
			increaseCapacity();
		}
		array[index] = obj;
		index++;
	}

	private void increaseCapacity() {
		Object temp[] = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public Object get(int index) {
		return array[index];
	}

	public void add(int inx, Object obj) {
		int a = index;
		for (int i = index - 1; i >= inx; i--) {
			array[a] = array[i];
			a--;
		}
		array[inx] = obj;
		index++;
	}

	public boolean isEmpty() {
		if (index == 0) {
			return true;
		}
		return false;
	}

	public boolean contains(Object value) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < index + 1; i++) {
			if (array[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

	public void remove(int inx) {
		for (int i = 0; i < index; i++) {
			if (i == inx) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];
				}
				index--;
				return;
			}
		}
	}

	public void remove(Object inx) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(inx)) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];
				}
				index--;
				return;
			}
		}
	}

	public Iterator<Object> iterator() {
		return new MyItr();
	}

	
	public class MyItr implements Iterator<Object>{

		int index;
		
		
		@Override
		public boolean hasNext() {
			if (array[index] !=null) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}
		
		
	}
	
	public void mytoString() {
		System.out.print("[");
		for (int i = 0; i < index; i++) {
			if (i==index-1) {
				System.out.print(array[i]);
				break;
			}
			System.out.print(array[i]+",");
		}
	    System.out.print("]");
		
	}
}
