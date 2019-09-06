package com.bridgeit.function;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int row, col, i, j;
		int arr[][] = new int[5][5];
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for the array(max 5):");
        row = sc.nextInt();
        System.out.println("Enter coloumn for the array (max 5):");
        col = sc.nextInt();
        
        System.out.println("Enter" + (row*col)+ "Array Elements:");
        for(i=0; i<row; i++)
        {
        	for(j=0;j<col; j++)
        	{
        		arr[i][j] = sc.nextInt();
        		
        	}
        }
        System.out.print("The Array is:\n");
        for(i=0;i<row;i++) {
        	for(j=0;j<col;j++) 
        	{
        		System.out.print(arr[i][j]+ " ");
        	}
        	System.out.println();
        }
        
        
	}

}
