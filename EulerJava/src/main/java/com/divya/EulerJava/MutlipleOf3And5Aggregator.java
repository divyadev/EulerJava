package com.divya.EulerJava;

public class MutlipleOf3And5Aggregator {

	public int get3And5MultipleSumForRange(int rangeStart, int rangeEnd) {
		int sum=0;
		for (int currentNumber = rangeStart; currentNumber <= rangeEnd; currentNumber++) {
			if(currentNumber % 3 == 0 || currentNumber % 5 ==0 ) {
				sum += currentNumber;
				System.out.println("Number is " + currentNumber);
			}
		}
		return sum;
	}

}
