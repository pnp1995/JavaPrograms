package com.bridgeit.function;

import com.bridgeit.Utility.Utility;

public class Flipcoin {

	public static void main(String[] args) {
		int n, h_cnt = 0, t_cnt = 0;
		double heads, tails;
		double val = 0;
		

		System.out.print("enter no. of times you want to flip the coin: ");
		n =Utility.nextInt();
		{

			
			 for(int i=0;i<n;i++)
			 {
				 val = Math.random(); 
				 System.out.println(val);
			 if(val < 0.5)
				 t_cnt++; 
			 else
				 h_cnt++; 
			 }
			
			heads = (h_cnt / n) * 100;
			tails = (t_cnt / n) * 100;
			System.out.println("Percentage of heads: " + heads + " percentage");
			System.out.println("Percentage of tails: " + tails + " percentage");
		}
	}

}
