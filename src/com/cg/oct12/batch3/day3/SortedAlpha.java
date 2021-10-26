package com.cg.oct12.batch3.day3;
import java.util.*;

public class SortedAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE NO OF STRINGS");
		int size=scn.nextInt();
		String[] s=new String[size];
		System.out.println("ENTER THE STRINGS");
		for(int i=0;i<size;i++) {
			s[i]=scn.next();
		}
		sortStrings(s);
		 System.out.println(sortStrings(s));
		
		

	}
	static String sortStrings(String[] s) {
		int n=s.length;
	 Arrays.sort(s);
	 String[] s1=new String[n];
	 for(int i=0;i<n;i++) {
		 s1[i]=s[i];
	 }
	if(n%2==0) {
		 for(int i=0;i<(n/2);i++)
		 {
			 s[i]=s[i].toUpperCase();
		 }
	}else {
		 for(int i=0;i<(n/2)+1;i++)
		 {
			 s[i]=s[i].toUpperCase();
		 }
	}
	 
	 return  Arrays.toString(s1); 
	}

}
