package com.cg.oct12.batch3.day3;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank h=new HdfcBank();
		h.balance=1000;
		h.checkBalance();

	}

}
class HdfcBank{
	static String ifsc;
       double balance;
	void checkBalance()
	{
		System.out.println(this.balance);
	}
}
