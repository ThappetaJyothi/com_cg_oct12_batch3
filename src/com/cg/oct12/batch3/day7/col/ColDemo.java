package com.cg.oct12.batch3.day7.col;

import java.util.ArrayList;


public class ColDemo {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(arr[4]);

		ArrayList myList = new ArrayList();

		//App obj = new App();

		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(2,350);
		//myList.add(new App());
		//myList.add(obj);
		System.out.println(myList.size());

		System.out.println(myList);

		System.out.println(myList.get(2));
		System.out.println(myList.size());
		ArrayList mylist2=new ArrayList();
		mylist2.add(myList);
		System.out.println(mylist2.size());
		
		

	}
}