package testCase;

import static org.junit.Assert.*;

import javax.swing.JRadioButton;

import org.junit.Before;
import org.junit.Test;

import GameData.GameData;
import GameData.OddsCal;
import GameData.Results;
import GameTheoryAndMain.GameTools;
import GameTheoryAndMain.LinesValidator;
import GameTheoryAndMain.UI;

import java.util.ArrayList;
public class TestGameTools {

	@Before
	public void setUp() throws Exception {
	}

	static class stubLinesValidator extends LinesValidator{
		public static boolean oneLine(ArrayList<Results> R, int bet)
		{
			return true;
		}
		public static boolean oneToThreeline(ArrayList<Results> R, int bet)
		{
			return true;
		}
		public static boolean oneToFiveline(ArrayList<Results> R, int bet)
		{
			return true;
		}
		public static boolean oneTo13line(ArrayList<Results> R, int bet)
		{
			return true;
		}
		
	}
	static class StubGameTools extends GameTools {
		public static double CalProfit(int bet, int lines)
		{
				double profit = 0;
				switch (lines){
				case 1:  
					if (stubLinesValidator.oneLine(GameData.RList, bet)==true)
				{
						profit = 100.0;
				}
					break;
				case 3:  
					if (stubLinesValidator.oneToThreeline(GameData.RList, bet)==true)
				{
						profit = 300.0;
				}
					break;
				case 5:  
					if (stubLinesValidator.oneToFiveline(GameData.RList, bet)==true)
				{
						profit = 500.0;
				}
					break;
				case 13:  
					if (stubLinesValidator.oneTo13line(GameData.RList, bet)==true)
				{
						profit = 1300.0;
				}
					break;
			}
				/*if (profit==0)
				{
					GameData.windows.console.setText("You Lose!");
				}
				else
				{
					GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
				}*/
				
		 	return profit;
		}
	}
	@Test	//bet = 10 & line = 1, result = 100.0
	public void testCalProfit() {
		stubLinesValidator.oneLine(null, 10);
		double results = StubGameTools.CalProfit(10, 1);
		assertEquals(100.0, results, 0);
	}
	
	@Test	//bet = 10 & line = 3, result = 300.0
	public void testCalProfit1() {
		stubLinesValidator.oneToThreeline(null, 10);
		double results = StubGameTools.CalProfit(10, 3);
		assertEquals(300.0, results, 0);
	}
	
	@Test	//bet = 10 & line = 5, result = 500.0
	public void testCalProfit2() {
		stubLinesValidator.oneToFiveline(null, 10);
		double results = StubGameTools.CalProfit(10, 5);
		assertEquals(500.0, results, 0);
	}
	
	@Test	//bet = 10 & line = 13, result = 1300.0
	public void testCalProfit3() {
		stubLinesValidator.oneTo13line(null, 10);
		double results = StubGameTools.CalProfit(10, 13);
		assertEquals(1300.0, results, 0);
	}

	@Test	//check if Select = false&bet=10, return 0(expect)
	public void testCheckBetLines() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.inputOdd.setText("10");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet>10, return 1(expect)
	public void testCheckBetLines2() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(true);
		GameData.windows.inputOdd.setText("20");
		int result = GameTools.checkBetLines();
		assertEquals(1, result);
	}
	
	@Test	//check if Select = true&bet<10, return 0(expect)
	public void testCheckBetLines3() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(true);
		GameData.windows.inputOdd.setText("5");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet=10, return 1(expect)
	public void testCheckBetLines4() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(true);
		GameData.windows.inputOdd.setText("10");
		int result = GameTools.checkBetLines();
		assertEquals(1, result);
	}
	
	@Test	//check if Select = false&bet=30, return 0(expect)
	public void testCheckBetLines5() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet3Lines.setSelected(false);
		GameData.windows.inputOdd.setText("30");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet>30, return 3(expect)
	public void testCheckBetLines6() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet3Lines.setSelected(true);
		GameData.windows.inputOdd.setText("40");
		int result = GameTools.checkBetLines();
		assertEquals(3, result);
	}
	
	@Test	//check if Select = true&bet<30, return 0(expect)
	public void testCheckBetLines7() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet3Lines.setSelected(true);
		GameData.windows.inputOdd.setText("20");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet=30, return 3(expect)
	public void testCheckBetLines8() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet3Lines.setSelected(true);
		GameData.windows.inputOdd.setText("30");
		int result = GameTools.checkBetLines();
		assertEquals(3, result);
	}
	
	@Test	//check if Select = false&bet=50, return 0(expect)
	public void testCheckBetLines9() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet5Lines.setSelected(false);
		GameData.windows.inputOdd.setText("50");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet>50, return 5(expect)
	public void testCheckBetLines10() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet5Lines.setSelected(true);
		GameData.windows.inputOdd.setText("60");
		int result = GameTools.checkBetLines();
		assertEquals(5, result);
	}
	
	@Test	//check if Select = true&bet<50, return 0(expect)
	public void testCheckBetLines11() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet5Lines.setSelected(true);
		GameData.windows.inputOdd.setText("40");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet=50, return 5(expect)
	public void testCheckBetLines12() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet5Lines.setSelected(true);
		GameData.windows.inputOdd.setText("50");
		int result = GameTools.checkBetLines();
		assertEquals(5, result);
	}
	
	@Test	//check if Select = false&bet=100, return 0(expect)
	public void testCheckBetLines13() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet13Lines.setSelected(false);
		GameData.windows.inputOdd.setText("100");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet>100, return 13(expect)
	public void testCheckBetLines14() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet13Lines.setSelected(true);
		GameData.windows.inputOdd.setText("110");
		int result = GameTools.checkBetLines();
		assertEquals(13, result);
	}
	
	@Test	//check if Select = true&bet<100, return 0(expect)
	public void testCheckBetLines15() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet13Lines.setSelected(true);
		GameData.windows.inputOdd.setText("90");
		int result = GameTools.checkBetLines();
		assertEquals(0, result);
	}
	
	@Test	//check if Select = true&bet=100, return 13(expect)
	public void testCheckBetLines16() {
		GameData.windows = new UI();
		GameData.windows.Bet1Lines.setSelected(false);
		GameData.windows.Bet13Lines.setSelected(true);
		GameData.windows.inputOdd.setText("100");
		int result = GameTools.checkBetLines();
		assertEquals(13, result);
	}
	

	@Test	//check if bet>amount, return false(expect)
	public void testCheckBetAmount() {
		boolean result;
		result = GameTools.checkBetAmount(1000, 100.0);
		assertEquals(false, result);
	}
	
	
	@Test	//check if bet<amount, return true(expect)
	public void testCheckBetAmount2() {
		boolean result;
		result = GameTools.checkBetAmount(100, 1000.0);
		assertEquals(true, result);
	}
	
	@Test	//check if bet=amount, return true(expect)
	public void testCheckBetAmount3() {
		boolean result;
		result = GameTools.checkBetAmount(1000, 1000.0);
		assertEquals(true, result);
	}

	@Test	//check if 10>amount, return false(expect)
	public void testAccountBalanceSuffient() {
		boolean result;
		result = GameTools.accountBalanceSuffient(5.0);
		assertEquals(false, result);
	}
	
	@Test	//check if 10<amount, return true(expect)
	public void testAccountBalanceSuffient2() {
		boolean result;
		result = GameTools.accountBalanceSuffient(100.0);
		assertEquals(true, result);
	}
	
	@Test	//check if 10=amount, return true(expect)
	public void testAccountBalanceSuffient3() {
		boolean result;
		result = GameTools.accountBalanceSuffient(10.0);
		assertEquals(true, result);
	}

}
