package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.Monkey;


public class TestMonkey {
	@Test
    public void testMonkeyGetName() {
		Monkey testMonkey = new Monkey("", 0.0,null);
		String s = testMonkey.getName();
		assertEquals("Monkey", s);
    }
	@Test
    public void testMonkeyGetOdds() {
		Monkey testMonkey = new Monkey("", 0.0,null);
		double odds = testMonkey.getOdd();
		assertEquals(2, odds, 0.0);
    }
}
