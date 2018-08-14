package testCase;
import static org.junit.Assert.*;
import javax.swing.ImageIcon;

import org.junit.Test;

import Fruits.Bonus;
import GameTheoryAndMain.ImagesSetting;


public class TestBonus {
	@Test
    public void testBonusGetName() {
		Bonus testBonus = new Bonus("", 0.0,null);
		String s = testBonus.getName();
		assertEquals("Bonus", s);
    }
	@Test
    public void testBonusGetOdds() {
		Bonus testBonus = new Bonus("", 0.0,null);
		double odds = testBonus.getOdd();
		assertEquals(50, odds, 0.0);
    }
}
