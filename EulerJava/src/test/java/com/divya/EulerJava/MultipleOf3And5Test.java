package com.divya.EulerJava;

import org.junit.Assert;
import org.junit.Test;

public class MultipleOf3And5Test {


	@Test
	public void testMutipleSumFrom1To10() {
		int rangeStart = 1;
		int rangeEnd = 10;
		int expectedSum = 33;
		
		doTestMultipleSumForGivenRange(rangeStart, rangeEnd, expectedSum);
		
	}

	private void doTestMultipleSumForGivenRange(int rangeStart, int rangeEnd, int expectedSum) {
		MutlipleOf3And5Aggregator aggregator = new MutlipleOf3And5Aggregator();
		int actualSum = aggregator.get3And5MultipleSumForRange(rangeStart, rangeEnd);
		Assert.assertEquals(expectedSum, actualSum);
	}

	@Test
	public void testMutipleSumFrom1To9() {
		int rangeStart = 1;
		int rangeEnd = 9;
		int expectedSum = 23;
		
		doTestMultipleSumForGivenRange(rangeStart, rangeEnd, expectedSum);
		
	}
	
	
}
