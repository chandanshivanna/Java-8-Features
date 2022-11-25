package com.java8.programs;

import java.util.Optional;

public class Java8_Optional_Prg1 {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("Male");
		String answer1 = "Hi";
		String answer2 = null;
		
		Optional<String> option = Optional.ofNullable(null);
		
		System.out.println("Non-empty optional :" +answer1);
		System.out.println("Non-empty optional :Gender value :" +gender.get());
		System.out.println("Empty optional :" +Optional.empty());
		
		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
		System.out.println("Null object " +gender.orElse("empty object"));
        System.out.println("Null object1 :"+option.orElse("empty one"));
        
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

	}

}
