package com.cg.oct12.batch3.day3;

public class MethodArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodArg a=new MethodArg();
		System.out.println(a.addArguments(10, 10));
		a.addNum(20,20);
	}
		static int addArguments(int i,int j)
		{
			return i+j;
		}
		static void addNum(int  i, int j) {
			System.out.println(i+j);
		}

	

}
