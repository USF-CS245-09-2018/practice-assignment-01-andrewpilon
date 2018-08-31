// package edu.usfca.cs.cs245;

public class FactorialRecursive implements Factorial {

	public int factorial(int n) {
		
		if(n<0) {
			System.out.println("Invalid entry - please use a number greater than zero.");
			return -1;
		}
		else if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}