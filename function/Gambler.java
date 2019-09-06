package com.bridgeit.function;

import java.util.Random;

import com.bridgeit.Utility.Utility;

public class Gambler {

	public static void main(String[] args)
	{
		System.out.println("Enter Stake:");
		int stake1 = Utility.nextInt();
		
		System.out.println("Enter goal:");
		int goal = Utility.nextInt();
		
		System.out.println("Enter n:");
		int n = Utility.nextInt();
		
		int bets = 0;
		int wins = 0;
        for (int i = 0; i < n; i++) {
			int stake = stake1;
			while(stake>0 && stake<goal){
			
				Random random = nextRandom();
				boolean win = random.nextBoolean();
				
				bets = bets+1;
				if(win == true){
					stake++;
				}
				else{
					stake--;
				
				}
			if (stake == goal){
				 wins+ = 1;
			}
			}
				float win_per = wins*100/(n);
		System.out.println("win percentage:" + win_per);
        System.out.println("Avg no of bets:" + (float)bets /n);
		
	}

		
	}
	
}
	


