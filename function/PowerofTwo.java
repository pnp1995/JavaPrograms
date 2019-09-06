package com.bridgeit.function;

public class PowerofTwo {

	public static void main(String[] args) 
	{
int n = 31;
int i = 0;
int power = 1;
System.out.println("Power of 2 that are less than 2^" +31);
while(i<=n)
{
	System.out.println("2^"+i+"=" +power);
	power = power*2;
	i++;
}

	}

}
