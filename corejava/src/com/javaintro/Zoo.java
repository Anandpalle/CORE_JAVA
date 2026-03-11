
package com.javaintro;

public class Zoo {
	public static void domesticAnimal()  {
        System.out.println("static method");
        ominiAnimal();
        
    }

    public void wildAnimal() {
        System.out.println("instance method");
    }

    public static void main(String[] args) {
       
        System.out.println("main method");
        
        domesticAnimal();
     
        
    }
    public static void ominiAnimal()  {
    	System.out.println("static method 1");
    	Zoo z = new Zoo();
    	z.wildAnimal();
    	   
    	  
    }
}

