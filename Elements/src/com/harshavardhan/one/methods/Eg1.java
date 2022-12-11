package com.harshavardhan.one.methods;

public class Eg1 {

	public static void main(String[] args) {
		
		//Eg1 eg1 = new Eg1();
		// Direct approach
		m1();
		m2();
		m3();
		m4();
		m5();
		
		// ClassName.staticMethodName
		
		Eg1.m1();
		Eg1.m2();
		Eg1.m3();
		Eg1.m4();
		Eg1.m5();

	}
	
	// Static Method
	
	public static void m1(){
		System.out.println("M1 Method");
	}
	public static void m2(){
		System.out.println("M2 Method");
	}
	public static void m3(){
		System.out.println("M3 Method");
	}
	public static void m4(){
		System.out.println("M4 Method");
	}
	public static void m5(){
		System.out.println("M5 Method");
	}

}
