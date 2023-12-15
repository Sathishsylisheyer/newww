package org.Banking;

public class Encapsu1 {
	public static void main(String[] args) {
		Encapsu acc=new Encapsu();
		acc.setAcc_no(12345);
		acc.setAmount(9000000);
		acc.setEmail("Sathishsylisheyer@gmail.com");
		acc.setName("SATHISHKUMAR THIRUMOORTHI");
		System.out.println();
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		System.out.println(acc.getEmail());
		System.out.println(acc.getName());
		
	}

}
