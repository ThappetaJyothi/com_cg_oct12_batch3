package com.cg.oct12.batch3.day3;
import java.util.*;

public class SecondSmallArray {

	public static void main(String[] args) {
		
 Scanner scn=new Scanner(System.in);
 System.out.println("ENTER THE SIZE OF ARRAY");
 int n=scn.nextInt();
 int[] arr=new int[n];
 System.out.println("ENTER THE ARRAY");
 for(int i=0;i<n;i++) {
	 arr[i]=scn.nextInt();
 }
        int sec=getSecondSmallest(arr);
		 System.out.println(sec);

	}
	static int getSecondSmallest(int[] a) {
		int[] b=a;
		int min1=a[0];
		int min2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]< min1){
				min2=min1;
				min1=a[i];
			}
			else if(min1==min2||a[i]<min2) {
				min2=a[i];
			}
		}
		
		return min2;
	}

}
