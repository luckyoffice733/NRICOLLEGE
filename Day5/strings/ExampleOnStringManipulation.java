package com.training.strings;

public class ExampleOnStringManipulation {

	public static void main(String[] args) {

		// created string using string literal
		String s= "HelloWorld";
		// Returns the number of characters in the String.
		System.out.println("length of "+s+"is :" + s.length());

		// Returns the character at ith index.
		System.out.println("Character at 2nd position = "+ s.charAt(2));

		// Return the substring from the ith index character
		// to end of string
		System.out.println("Substring from index 3 is " + s.substring(3));

		// Returns the substring from i to j-1 index.
		System.out.println("Substring from index 2 to index 4  = " + s.substring(2,5));

		// Concatenates string2 to the end of string1.
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Concatenated string = " +s1.concat(s2));

		// Returns the index within the string
		// of the first occurrence of the specified string.
		String s4 = "Hello World";
		System.out.println("Index of World is  " +s4.indexOf("World"));

		// Checking equality of Strings
		boolean out = "HELLO".equals("hello");
		System.out.println("Checking Equality of HELLO and hello " + out);

		out = "HELLO".equals("HELLO");
		System.out.println("Checking Equality " + out);

		out = "HeLlo".equalsIgnoreCase("Hello");
		System.out.println("Checking Equality " + out);

		// Converting cases
        String word1 = "World";
        System.out.println("Changing to lower Case " +word1.toLowerCase());

        // Converting cases
        String word2 = "world";
        System.out.println("Changing to UPPER Case " +word2.toUpperCase());

     // Trimming the word
        String word4 = " Welcome to Java ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "Hello";
        System.out.println("Original String " + str1);
        String str2 = "Hello".replace('H' ,'M') ;
        System.out.println("Replaced H with M -> " + str2);
        
        String st ="Hadoop is framework to store huge amount of data and process"
        		+ " huge of data parallelly";
        System.out.println(st);
        
        //String String[] split() is responble to convert line to worlds(String token);
        
        String sp1[] = st.split(" ");
        System.out.println("Converting into Words");
        for(int i=0;i<sp1.length;i++) {
        	System.out.println(sp1[i]);
        }
        
        String st2 = "Python#is#simple#way#to#learn";
        String sp2[] = st2.split(" ");
        System.out.println("Converting into Words");
        for(int i=0;i<sp2.length;i++) {
        	System.out.println(sp2[i]);
        }
        
        
        
        
        
        
        
        
        


	}

}
