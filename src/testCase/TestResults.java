package testCase;
import static org.junit.Assert.*;

import org.junit.Test;

import Fruits.Bonus;
import Fruits.Fruits;
import GameData.Results;
import GameTheoryAndMain.GameTools;


public class TestResults {
	@Test
    public void testResultsGetId() {
		Results r = new Results(2);
		int testId = r.getId();
		assertEquals(2,testId);
    }
	@Test
    public void testResultsGetSetFruits() {
		Results r = new Results(2);
		Bonus testBonus = new Bonus("", 0.0,null);
		r.setFruits(testBonus);
		Fruits testFruits = r.getFruits();
		assertEquals(testFruits, testBonus);
    }
	@Test
    public void testResultsGetSetLabelId() {
		Results r = new Results(2);
		r.setLableid("HelloWorld");
		String s = r.getLableid();
		assertEquals("HelloWorld", s);
    }
	@Test
    public void testResultsGetSetResultsToFruits() {
		GameTools.FlistInitialize();
		Results r = new Results(2);
		r.setResultsToFruits(1);
		int i = r.getResultsToFruits();
		assertEquals(1, i);
    }
}
