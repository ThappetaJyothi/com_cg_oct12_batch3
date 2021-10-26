package com.cg.oct12.batch3.day3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=scn.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER ELEMENTS");
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		getSorted(a);
		System.out.println(Arrays.toString(a));

	}
	static  void getSorted(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]< a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
