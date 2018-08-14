package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.Tiger;


public class TestTiger {
	@Test
    public void testTigerGetName() {
		Tiger testTiger = new Tiger("", 0.0,null);
		String s = testTiger.getName();
		assertEquals("Tiger", s);
    }
	@Test
    public void testTigerGetOdds() {
		Tiger testTiger = new Tiger("", 0.0,null);
		double odds = testTiger.getOdd();
		assertEquals(10, odds, 0.0);
    }
}
