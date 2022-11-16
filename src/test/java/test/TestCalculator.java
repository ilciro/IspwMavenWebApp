package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.Calculator;

class TestCalculator {
	private Calculator c=new Calculator();

	@Test
	void testAdd() {
		c.setA(2);
		c.setB(5);
		assertEquals(7,c.add(c.getA(),c.getB()));
	}

}
