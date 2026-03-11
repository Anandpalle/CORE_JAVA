package com.stringhandling;

public class Demo4 {
	void main() {
          String str1="Anand";
          String str2="Anand";
        
        
          System.out.println(str1.charAt(4));
   
     
          System.out.println(str1.hashCode());
          System.out.println(str2.hashCode());
          
          System.out.println(System.identityHashCode(str1));
          System.out.println(System.identityHashCode(str2));
          
             
	}

}
