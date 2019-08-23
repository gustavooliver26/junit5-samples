package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

     

  


     @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
		assertEquals(0, calculator.add(-1, 1));
        assertEquals(2, calculator.add(1.5,5));
        assertEquals("a", calculator.add(4,5));	
		assertEquals(0, calculator.add(-1,1));	
		
		
    }
	
	@Test
	void sub() {
		assertEquals(4, calculator.sub(2, 2));
	    assertEquals(3, calculator.sub(-2, 5));
		assertEquals(3, calculator.sub(2.5, 0.5));
		assertEquals("b", calculator.sub(2,5));	
		assertEquals(1, calculator.sub(-4,5));
	
	
	}
	
	@Test
	void mult() {
		assertEquals(7, calculator.mult(5, 2));
		assertEquals(5, calculator.mult(-5, 10));
		assertEquals(2, calculator.mult(1.50, 0.50));
	    assertEquals("c", calculator.mult(1,5));		
			assertEquals(3, calculator.mult(-2,5));
	}
	
	@Test
	void div() {
		assertEquals(42, calculator.div(40, 2));
		assertEquals(10, calculator.div(-10, 20));
		assertEquals(6, calculator.div(5.50, 0.50));
		assertEquals("d", calculator.div(3,5));	
		assertEquals(5, calculator.div(-5,10));
	}
	

	
}