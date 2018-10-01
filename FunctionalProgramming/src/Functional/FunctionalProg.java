package Functional;

import java.util.Arrays;

public class FunctionalProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	    
	    String[] languages = {"Java","Groovy","Python","scala"};
	    Arrays.stream(languages)
	          .map(language->language.toUpperCase())
	          .forEach(language -> System.out.println("Welcome to world of " + language + " Programming Language!"));
	    
		String[] strings = {"three","two","one","twenty"};
		Arrays.stream(strings)
			  .filter(s -> s.startsWith("t"))
		      .map(String::toUpperCase)      
		      .forEach(System.out::println);
		//Map reduce and get function to convert list to String
			if( 
			Arrays.stream(strings)
			.filter(s -> s.startsWith("t"))
			.map(s->s.toUpperCase())
			.sorted()
			.reduce((word1, word2) 
			        -> word1.length() > word2.length() 
			                      ? word1 : word2).get().startsWith("T"))
				{
				System.out.println("Starts with T");
				}
		//Map reduce to converting list to single value
		System.out.println(
		Arrays.stream(strings)
		.filter(s -> s.startsWith("t"))
		.map(s->s.toUpperCase())
		.sorted()
		.reduce((word1, word2) 
		        -> word1.length() > word2.length() 
		                      ? word1 : word2));
}
	

}
