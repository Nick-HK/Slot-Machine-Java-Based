package testCase;
import static org.junit.Assert.*;

import org.junit.Test;
import Fruits.Snake;


public class TestSnake {
	@Test
    public void testSnakeGetName() {
		Snake testSnake = new Snake("", 0.0,null);
		String s = testSnake.getName();
		assertEquals("Snake", s);
    }
	@Test
    public void testSnakeGetOdds() {
		Snake testSnake = new Snake("", 0.0,null);
		double odds = testSnake.getOdd();
		assertEquals(5, odds, 0.0);
    }
}
