package com.stringhandling;

public class Demo2 {
	public static void main(String[] args) {
         String a="Anand";
         String b=new String("Anand");
         System.out.println(a==b);
         System.out.println(a.equals(b));
	}
}
//in these case one is stored in string constant pool(SCP) 
//and another one is stored in heap memory so,that while comparing both 
//it returns false
//conclusion:String literals stored in SCP and String objects stored in heap memory