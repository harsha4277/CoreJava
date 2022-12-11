package com.harshavardhan.one.blocks;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Eg1();
	}
	
	// instance block
	{
		System.out.println("Instance Block");
	}

	static {
		System.out.println("Static Block");
	}
}
