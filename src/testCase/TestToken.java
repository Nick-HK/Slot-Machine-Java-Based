package testCase;
import static org.junit.Assert.*;
import javax.swing.ImageIcon;

import org.junit.Test;

import Fruits.Bonus;
import GameData.Token;
import GameTheoryAndMain.ImagesSetting;


public class TestToken {
	@Test
    public void testTokenGetToken() {
		Token t = new Token(1000);
		double testToken = t.getToken();
		assertEquals(1000,testToken,0.0);
    }
	@Test
    public void testTokenToString() {
		Token t = new Token(1000);
		String s = t.toString();
		assertEquals("1000",s);
    }
}
