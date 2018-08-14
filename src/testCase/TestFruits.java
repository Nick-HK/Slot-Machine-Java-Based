package testCase;
import static org.junit.Assert.*;

import org.junit.Test;

import Fruits.Fruits;


public class TestFruits {
	@Test
    public void testFruitsGetSetName() {
		Fruits testFruits = new Fruits("", 0.0,null);
		testFruits.setName("Hello World");
		String s = testFruits.getName();
		assertEquals("Hello World", s);
    }
	@Test
    public void testFruitsGetSetOdd() {
		Fruits testFruits = new Fruits("", 0.0,null);
		testFruits.setOdd(666);
		double testOdd = testFruits.getOdd();
		assertEquals(666, testOdd, 0.0);
    }
}
