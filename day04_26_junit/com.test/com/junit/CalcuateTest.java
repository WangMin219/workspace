package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcuateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass....");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp....");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown....");
	}
	Calcuate calcuate=new Calcuate();

	@Test
	void testAdd() {		
		Assert.assertEquals(9, calcuate.add(4, 5));
		System.out.println("testAdd().....");
		
	}

	@Test
	void testSub() {
		Assert.assertEquals(-1, calcuate.sub(4, 5));
		System.out.println("testSub().....");
	}

	@Test
	void testMul() {
		Assert.assertEquals(20, calcuate.mul(4, 5));
		System.out.println("testMul().....");
	}

	@Test
	void testDiv() {
		Assert.assertEquals(0, calcuate.div(4, 5));
		System.out.println("testDiv().....");
	}
		

	
}
