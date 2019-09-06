package com.bridgeit.function;

import com.bridgeit.Utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) 
	{
		System.out.println("Enter Number(N)");
		int number = Utility.nextInt();
		System.out.println("prime factor of "+number+" is :");
		findPrimeFactor(number);
		
		
		
	}

	private static  void findPrimeFactor(int number) 
	{
		for(int i=1;i*i<=number;i++)
			if(number%i==0)
				System.out.println("" +i);
		
	}

}
