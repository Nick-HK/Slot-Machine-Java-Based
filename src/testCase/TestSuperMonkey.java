package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.SuperMonkey;


public class TestSuperMonkey {
	@Test
    public void testSuperMonkeyGetName() {
		SuperMonkey testSuperMonkey = new SuperMonkey("", 0.0,null);
		String s = testSuperMonkey.getName();
		assertEquals("SuperMonkey", s);
    }
	@Test
    public void testSuperMonkeyGetOdds() {
		SuperMonkey testSuperMonkey = new SuperMonkey("", 0.0,null);
		double odds = testSuperMonkey.getOdd();
		assertEquals(100, odds, 0.0);
    }
}
