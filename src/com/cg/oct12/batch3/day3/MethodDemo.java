package com.cg.oct12.batch3.day3;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("START");
		hello();
		hello();
		hello();
		MethodDemo m=new MethodDemo();
		m.hi();
		System.out.println("END");    

	}
	  static void hello()
	{
		System.out.println("HELLO WORLD");
	}
	  void hi()
	  {
		  System.out.println("HI");
	  }
}
