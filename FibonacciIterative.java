// package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {
		
		if(n<=1) {
			return n;
		}
		int fib0 = 1;
		int fib1 = 1;
		int temp;
		for(int i=2; i<n;i++) {
			temp = fib1;
			fib1 += fib0;
			fib0 = temp;
		}

		return fib1;
	}
}