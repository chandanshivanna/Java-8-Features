package com.java8.programs;

import java.util.Optional;

public class Java8_Optional {

	public static void main(String[] args) {

		//String email = null;
		String email = "sumithra@gmail.com";
		
		//of, empty, ofNullabe
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
//		Optional<String> emailOptional = Optional.of(email);
//		System.out.println(emailOptional);
		
		Optional<String> stringOptional = Optional.ofNullable(email);
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional);
		
		String defaultOptional2 = stringOptional.orElseGet(()->"default2@gmail.com");
		System.out.println(defaultOptional2);
		
//		String optionalObject = stringOptional.orElseThrow(()-> new IllegalArgumentException("Email is not exist"));
//		System.out.println(optionalObject);
		
		// ifPresent
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional2 = Optional.empty();
		
		gender.ifPresent((r) ->System.out.println("Value is present"));
		emptyOptional2.ifPresent((r)->System.out.println("no value present"));
		
		String result = " abc ";
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res ->res.contains("abc")).map(String::trim).ifPresent((res)->System.out.println(res));
		
		
	}

}
