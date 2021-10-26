

package com.cg.oct12.batch3.day4;

public class AcessDemo {

	public static int publicMember = 10;
	protected static int protectedMember = 20;
	static int packageMember = 30;
	private static int privateMember = 40;

	public static void main(String[] args) {

		System.out.println(AcessDemo.publicMember);
		System.out.println(AcessDemo.protectedMember);
		System.out.println(AcessDemo.packageMember);
		System.out.println(AcessDemo.privateMember);

	}

}