package com.bridgeit.function;

import java.util.Scanner;

public class LeapYear 
{
	public static boolean leapYearChecker(int year)
	{
		if (year>1000)
		{
			if((year%400 == 0)||((year%4 == 0)&&(year%100 !=0)))
			{
				return true;
				
			}
		}
		return false;
		}
	
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the year");
		 int year = sc.nextInt();
		 boolean result = leapYearChecker(year);
		 
		 if (result)
		 {
			 System.out.print("year:"+ year + "is leap year");
		 
		 }
		
		 else
		 {
			 System.out.println("year:"+ year + "is not leap year");
	}

}
}