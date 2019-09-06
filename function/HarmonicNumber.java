package com.bridgeit.function;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) 
	{
		
		double N;
		Scanner sc = new Scanner(System.in);
		System.err.println("enter harmonic value:");
		 N = sc.nextDouble();
		if (N!=0);
		{
			double r = 0.0;
			for(double i = 1; i<=N; i++)
			{
				r = r+(1/i) ;
		}
		
		System.out.println("the Nth Harmonic number will be:" + r);
				
	}

	}
	}
 