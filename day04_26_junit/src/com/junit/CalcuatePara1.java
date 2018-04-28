package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

class CalcuatePara1 {
	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	public CalcuatePara1(int expected, int input1, int input2) {
		super();
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Parameters  
	public static Collection<Object[]> data() { 
		return Arrays.asList(new Object[][]{
			 {3,1,2},
			 {4,2,2} 
		}) ;  
	}

	@Test
	void testAdd() {
		assertEquals(expected, new Calcuate().add(input1, input2));  
	}

}
