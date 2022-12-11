package com.harshavardhan.one.variables;

public class Eg4 {

	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		// instance variable
		System.out.println(new Eg4().x); // new ClassName.instanceVariable
		System.out.println(new Eg4().y); // new ClassName.instanceVariable
		
		Eg4 eg = new Eg4();
		System.out.println(eg.x); // object.instacevariable
		System.out.println(eg.y); // object.instacevariable
		
	}

}
