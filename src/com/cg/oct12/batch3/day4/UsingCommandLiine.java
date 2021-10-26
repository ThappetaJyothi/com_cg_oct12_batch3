package com.cg.oct12.batch3.day4;

import java.util.Arrays;

public class UsingCommandLiine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	

	}

}
