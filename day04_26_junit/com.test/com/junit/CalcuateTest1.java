package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalcuateTest1 {
	Calcuate calcuate=new Calcuate();

	@Test
	void testAdd() {
		
		Assert.assertEquals(10, calcuate.add(4, 5));
	}

	@Test
	void testSub() {
		Assert.assertEquals(-1, calcuate.add(4, 5));
	}

	@Test
	void testMul() {
		Assert.assertEquals(20, calcuate.add(4, 5));
	}

	@Test
	void testDiv() {
		Assert.assertEquals(0, calcuate.add(4, 5));
	}

}
