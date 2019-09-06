package com.bridgeit.function;

public class Permutation {

	//public static void main(String[] args) {
    // private static void permutation(String candidate, String remaining)
		@SuppressWarnings("null")
		private static void permutations(String candidate, String remaining)
		{
    	 String remaining1 = null;
		if(remaining1.length()== 0) {
			System.out.println(candidate);
    		 
    	 }
		for(int i = 0;i<remaining1.length();i++) {
			String newCandidate = candidate + remaining1.charAt(i);
			
			String newRemaining = remaining1.substring(0, i) + remaining1.substring(i + 1);
			
			permutations(newCandidate, newRemaining);
		}
     }
     public static void main(String[]args) {
    	 
    	 String s = "abc";
    	 permutations("", s);
     }                                                                                                                                        
     
    
}


