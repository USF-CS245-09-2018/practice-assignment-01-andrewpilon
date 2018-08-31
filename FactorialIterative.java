// package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial {

	public int factorial(int n) {

		if(n<0) {
			System.out.println("Invalid entry - please use a number greater than zero.");
			return -1;
		}
		else if(n==0 || n==1) {
			return 1;
		}
		int total = 1;
		for(int i=n; i>0; i--) {
			total *= i;
		}
		return total;
	}
}