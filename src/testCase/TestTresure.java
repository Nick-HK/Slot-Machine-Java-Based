package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.Tresure;


public class TestTresure {
	@Test
    public void testTresureGetName() {
		Tresure testTresure = new Tresure("", 0.0,null);
		String s = testTresure.getName();
		assertEquals("Tresure", s);
    }
	@Test
    public void testTresureGetOdds() {
		Tresure testTresure = new Tresure("", 0.0,null);
		double odds = testTresure.getOdd();
		assertEquals(20, odds, 0.0);
    }
}
