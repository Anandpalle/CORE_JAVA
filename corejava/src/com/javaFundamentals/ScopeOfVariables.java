package com.javaFundamentals;

public class ScopeOfVariables {
//	primitive + instance
	int a=10;
// object + instance
	String b="abcd";

//primitive + static
	static int a1=20;
//object + static
	static String b1="efgh";

	public static void main(String[] args) {
		ScopeOfVariables sv=new ScopeOfVariables();
		
//  accessing instance data is done through object reference variable	
		System.out.println(sv.a);
		System.out.println(sv.b);
//accessing static data is done through 
		//1) class name		2)object reference variables  and 3)directly
		
		//the best way and correct way of accessing  is by class name
		System.out.println(ScopeOfVariables.a1);
		System.out.println(ScopeOfVariables.b1);
		
// draw backs of accessing through object reference variable
		ScopeOfVariables sv2=null;
		System.out.println(sv2.a1);
		System.out.println(sv2.b1);
		
           
	}

}
