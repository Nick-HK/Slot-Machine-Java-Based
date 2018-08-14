package testCase;

import org.junit.Test;
import GameData.OddsCal;
import static org.junit.Assert.*;

public class TestOddsCal {
    
    @Test
    public void testMultiples3() {
        OddsCal odds = new OddsCal();
        odds.setOdds(10);
        double result = odds.calPayout(3, 100);
        assertEquals(1000, result, 0.0);
    }
    
    @Test
    public void testMultiples4() {
        OddsCal odds = new OddsCal();
        odds.setOdds(10);
        double result = odds.calPayout(4, 100);
        assertEquals(5000, result, 0.0);
    }
        
    @Test
    public void testMultiples5() {
        OddsCal odds = new OddsCal();
        odds.setOdds(10);
        double result = odds.calPayout(5, 100);
        assertEquals(10000, result, 0.0);
    }
        
    @Test
    public void testMultiplesElse() {
        OddsCal odds = new OddsCal();
        odds.setOdds(10);
        double result = odds.calPayout(6, 100);
        assertEquals(0, result, 0.0);
    }
    
    @Test
    public void testGetSetOdds() {
        OddsCal odds = new OddsCal();
        odds.setOdds(10);
        double result = odds.getOdds();
        assertEquals(10, result, 0.0);
    }
    
    @Test
    public void testGetSetPayout() {
        OddsCal odds = new OddsCal();
        odds.setPayout(10);
        double result = odds.getPayout();
        assertEquals(10, result, 0.0);
    }
    
    @Test
    public void testGetSetLine() {
        OddsCal odds = new OddsCal();
        odds.setLine("Test line");
        String result = odds.getLine();
        assertEquals("Test line", result);
    }
}
