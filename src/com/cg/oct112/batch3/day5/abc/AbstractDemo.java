package com.cg.oct112.batch3.day5.abc;

public class AbstractDemo {
	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.dokYC();
		Icic i=new Icic();
		i.dokYC();
	}

}
 abstract class Rbi{
             abstract void dokYC();
}
 class Hdfc extends Rbi{

	@Override
	void dokYC() {
		// TODO Auto-generated method stub
		System.out.println("aadhar");
	}
 }
 class Icic extends Rbi{

	@Override
	void dokYC() {
		// TODO Auto-generated method stub
		System.out.println("pan");
	}
 }
