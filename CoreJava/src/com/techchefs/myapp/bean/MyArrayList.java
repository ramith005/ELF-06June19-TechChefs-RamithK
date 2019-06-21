package com.techchefs.myapp.bean;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class MyArrayList {
	private Object[] myArray;
	private static int initialSize = 10;
	private int index;
	
	/**
	 * Below code this(10); is similar to //myArray = new Object[10];
	 * Below line can be removed if @log used after lombox jar in imported to java
	 * private static final Logger log = Logger.getLogger("loggercls");
	 */
	public MyArrayList() {
		this(initialSize);
	}
	
	public MyArrayList(int size) {
		if(size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than 0");
		}
		myArray = new Object[size];
		index = 0;
	}
	
	public void add(Object val) {
		
		if(index >= myArray.length) {
			Object[] myArrayNew = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, myArrayNew, 0, myArray.length);
			myArray = myArrayNew;
		}
		myArray[index] = val;
		index++;
	}//End of add
	
	public int getSize() {
		return index-1;
	}
	
	
	
	
	
	
	
	public Object remove(int position) {
		if(position > myArray.length) {
			throw new ArrayIndexOutOfBoundsException("position cant be greater than array size");
		}
		System.arraycopy(myArray, position+1, myArray, position, myArray.length-1-position);
		myArray[myArray.length -1] = null;
		
		return myArray;
	}
	
	public Object get(int position) {
		if(position < 0) {
			throw new ArrayIndexOutOfBoundsException("position can be less than 0");
		}
		return myArray[position];
	}
}
