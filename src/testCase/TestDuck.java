package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.Duck;


public class TestDuck {
	@Test
    public void testDuckGetName() {
		Duck testDuck = new Duck("", 0.0,null);
		String s = testDuck.getName();
		assertEquals("Duck", s);
    }
	@Test
    public void testDuckGetOdds() {
		Duck testDuck = new Duck("", 0.0,null);
		double odds = testDuck.getOdd();
		assertEquals(3, odds, 0.0);
    }
}
