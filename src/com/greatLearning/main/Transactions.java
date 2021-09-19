package com.greatLearning.main;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// get the size of transactions from user
		System.out.println( "Enter the number of transactions" );
		int size = sc.nextInt();
		
		// allocate an array of provided size
		int[] arr = new int[size];
		
		
		System.out.println( "Enter the transactions" );
		// get the elements of the array (in a loop)
		for( int i = 0; i < size; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		// get the number of targets
		System.out.println( "Enter the number of targets" );
		int numTargets = sc.nextInt();
				
		// loop so many times (as number of targets)
		for( int i = 0; i < numTargets; i++ ) {
			// get the target
			System.out.println( "Enter the target" );
			int target = sc.nextInt();
			
			// again start a loop to calculate the sum
			int sum = 0;
			for( int j = 0; j < arr.length; j++ ) {
				// sum till the element
				sum = sum + arr[j];
				
				// check if target is reached
				if( sum >= target ) {
					// print out the number of transactions when target is reached
					System.out.println( "Target is reached after " + ( j + 1 ) + " transactions" );
					break; // We stop execution of the closest (inner) for loop
				}
				
				// we reached the final transaction and target is still not reached :(
				if( j == arr.length - 1 && sum < target ) {
					System.out.println( "Target is not reached" );
				}
			}
		}
	}
}
