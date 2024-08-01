package com.training.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamConvertionCodeToCollections {
	
	public static void main(String[] args) {
		
		List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go",
				                                       "JavaScript", "Python", "Scala");
	    System.out.println("input list of String: " + listOfString);

	    //UseCase1 write a Stream code to get the String which starts with 'J'
	    //an convert the Stream object into list
	List<String> listOfStringWithStartJ =listOfString.stream().
			                                     filter(i -> i.startsWith("J")).
			                                                   collect(Collectors.toList());
	    System.out.println(listOfStringWithStartJ);
	    

	 // Example 3 - converting Stream to Map
Map<String, Integer> stringToLength  = listOfString.stream()
	                                             .collect(Collectors
	                                                    .toMap(Function.identity(),String::length));
	 System.out.println("map of string and their length: " + stringToLength);

	    
	    
	    
	    

	}

}
