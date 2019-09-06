package com.bridgeit.function;

import java.util.Scanner;

public class Qudratic {

	public static void main(String[] args) {
		System.out.println("Enter the Coefficients");
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c= sc.nextDouble();
		double root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		double root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		System.out.println("The roots1 are:"+ root1);
	    System.out.println("The roots2 are:" +root2);
	}
	

}
