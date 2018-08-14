package GameTheoryAndMain;

import java.util.concurrent.ThreadLocalRandom;

import Fruits.*;
import GameData.*;

public class GameTools {
	
	public static void RlistInitialize ()
	{
		for (int i = 0 ; i < 15 ; i++){
			GameData.RList.add(new Results(i));
			}
	}
	
	public static void FlistInitialize ()
	{
		GameData.FList.add(new Monkey("", 0.0,null));
		GameData.FList.add(new Duck("", 0.0,null));
		GameData.FList.add(new Snake("", 0.0,null));
		GameData.FList.add(new Tiger("", 0.0,null));
		GameData.FList.add(new Tresure("", 0.0,null));
		GameData.FList.add(new SuperMonkey("", 0.0,null));
		GameData.FList.add(new Bonus("", 0.0,null));
	}
	
	public static void col0Gen()
	{
		int indexC0 = ThreadLocalRandom.current().nextInt(0,GameData.col0.length-1);
		if ( indexC0 +1 == GameData.col0.length-1){
			GameData.RList.get(0).setResultsToFruits(GameData.col0[indexC0]);
			GameData.RList.get(5).setResultsToFruits(GameData.col0[indexC0+1]);
			GameData.RList.get(10).setResultsToFruits(GameData.col0[0]);
		}
		else if ( indexC0 == GameData.col0.length-1){
			GameData.RList.get(0).setResultsToFruits(GameData.col0[indexC0]);
			GameData.RList.get(5).setResultsToFruits(GameData.col0[0]);
			GameData.RList.get(10).setResultsToFruits(GameData.col0[1]);
		}
		else{
			GameData.RList.get(0).setResultsToFruits(GameData.col0[indexC0]);
			GameData.RList.get(5).setResultsToFruits(GameData.col0[indexC0+1]);
			GameData.RList.get(10).setResultsToFruits(GameData.col0[indexC0+2]);
		}
	}
	
	public static void col1Gen()
	{
		int indexC1 = ThreadLocalRandom.current().nextInt(0,GameData.col1.length-1);
		if ( indexC1 +1 == GameData.col1.length-1){
			GameData.RList.get(1).setResultsToFruits(GameData.col1[indexC1]);
			GameData.RList.get(6).setResultsToFruits(GameData.col1[indexC1+1]);
			GameData.RList.get(11).setResultsToFruits(GameData.col1[0]);
		}
		else if ( indexC1 == GameData.col1.length-1){
			GameData.RList.get(1).setResultsToFruits(GameData.col1[indexC1]);
			GameData.RList.get(6).setResultsToFruits(GameData.col1[0]);
			GameData.RList.get(11).setResultsToFruits(GameData.col1[1]);
		}
		else{
			GameData.RList.get(1).setResultsToFruits(GameData.col1[indexC1]);
			GameData.RList.get(6).setResultsToFruits(GameData.col1[indexC1+1]);
			GameData.RList.get(11).setResultsToFruits(GameData.col1[indexC1+2]);
		}
	}
	
	public static void col2Gen()
	{
		int indexC2 = ThreadLocalRandom.current().nextInt(0,GameData.col2.length-1);
		if ( indexC2 +1 == GameData.col2.length-1){
			GameData.RList.get(2).setResultsToFruits(GameData.col2[indexC2]);
			GameData.RList.get(7).setResultsToFruits(GameData.col2[indexC2+1]);
			GameData.RList.get(12).setResultsToFruits(GameData.col2[0]);
		}
		else if ( indexC2 == GameData.col2.length-1){
			GameData.RList.get(2).setResultsToFruits(GameData.col2[indexC2]);
			GameData.RList.get(7).setResultsToFruits(GameData.col2[0]);
			GameData.RList.get(12).setResultsToFruits(GameData.col2[1]);
		}
		else{
			GameData.RList.get(2).setResultsToFruits(GameData.col2[indexC2]);
			GameData.RList.get(7).setResultsToFruits(GameData.col2[indexC2+1]);
			GameData.RList.get(12).setResultsToFruits(GameData.col2[indexC2+2]);
		}
	}
	
	public static void col3Gen()
	{
		int indexC3 = ThreadLocalRandom.current().nextInt(0,GameData.col3.length-1);
		if ( indexC3 +1 == GameData.col3.length-1){
			GameData.RList.get(3).setResultsToFruits(GameData.col3[indexC3]);
			GameData.RList.get(8).setResultsToFruits(GameData.col3[indexC3+1]);
			GameData.RList.get(13).setResultsToFruits(GameData.col3[0]);
		}
		else if ( indexC3 == GameData.col3.length-1){
			GameData.RList.get(3).setResultsToFruits(GameData.col3[indexC3]);
			GameData.RList.get(8).setResultsToFruits(GameData.col3[0]);
			GameData.RList.get(13).setResultsToFruits(GameData.col3[1]);
		}
		else{
			GameData.RList.get(3).setResultsToFruits(GameData.col3[indexC3]);
			GameData.RList.get(8).setResultsToFruits(GameData.col3[indexC3+1]);
			GameData.RList.get(13).setResultsToFruits(GameData.col3[indexC3+2]);
		}
	}
	
	public static void col4Gen()
	{
		int indexC4 = ThreadLocalRandom.current().nextInt(0,GameData.col4.length-1);
		if ( indexC4 +1 == GameData.col4.length-1){
			GameData.RList.get(4).setResultsToFruits(GameData.col4[indexC4]);
			GameData.RList.get(9).setResultsToFruits(GameData.col4[indexC4+1]);
			GameData.RList.get(14).setResultsToFruits(GameData.col4[0]);
		}
		else if ( indexC4 == GameData.col4.length-1){
			GameData.RList.get(4).setResultsToFruits(GameData.col4[indexC4]);
			GameData.RList.get(9).setResultsToFruits(GameData.col4[0]);
			GameData.RList.get(14).setResultsToFruits(GameData.col4[1]);
		}
		else{
			GameData.RList.get(4).setResultsToFruits(GameData.col4[indexC4]);
			GameData.RList.get(9).setResultsToFruits(GameData.col4[indexC4+1]);
			GameData.RList.get(14).setResultsToFruits(GameData.col4[indexC4+2]);
		}
	}
	
	public static void genRandomNo ()
	{
		col0Gen();
		col1Gen();
		col2Gen();
		col3Gen();
		col4Gen();
		for (Results r: GameData.RList){
		r.genResults();
		}
	}
	
	public static double CalProfit(int bet, int lines)
	{
			double profit = 0;
			switch (lines){
			case 1:  
				if (LinesValidator.oneLine(GameData.RList, bet)==true)
			{
					profit = GameData.payout.getPayout();
			}
				break;
			case 3:  
				if (LinesValidator.oneToThreeline(GameData.RList, bet)==true)
			{
					profit = GameData.payout.getPayout();
			}
				break;
			case 5:  
				if (LinesValidator.oneToFiveline(GameData.RList, bet)==true)
			{
					profit = GameData.payout.getPayout();
			}
				break;
			case 13:  
				if (LinesValidator.oneTo13line(GameData.RList, bet)==true)
			{
					profit = GameData.payout.getPayout();
			}
				break;
		}
			if (profit==0)
			{
				GameData.windows.console.setText("You Lose!");
			}
			else
			{
				GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
			}
			
		//Old If then Else Version	
		/*if (LinesValidator.oneLine(GameData.RList, bet)==true && lines==1)
		{
			profit = GameData.payout.getPayout();
			GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
		}
		else if (LinesValidator.oneToThreeline(GameData.RList, bet)==true && lines==3)
		{
			profit = GameData.payout.getPayout();
			GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
		}
		else if (LinesValidator.oneToFiveline(GameData.RList, bet)==true && lines==5)
		{
			profit = GameData.payout.getPayout();
			GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
		}
		else if (LinesValidator.oneTo13line(GameData.RList, bet)==true && lines==13)
		{
			profit = GameData.payout.getPayout();
			GameData.windows.console.setText("You win $" +profit + " with " + GameData.payout.getLine() + "!");
		}
		else
		{
			GameData.windows.console.setText("You Lose!");
		}*/		
	 	return profit;
	}
	
	public static int checkBetLines ()
	{
		if (GameData.windows.Bet1Lines.isSelected()== true && Integer.parseInt(GameData.windows.inputOdd.getText()) >= 10)
		{
			return 1;
		}
		else if (GameData.windows.Bet3Lines.isSelected()== true && Integer.parseInt(GameData.windows.inputOdd.getText()) >= 30)
		{
			return 3;
		}
		else if (GameData.windows.Bet5Lines.isSelected()== true && Integer.parseInt(GameData.windows.inputOdd.getText()) >= 50)
		{
			return 5;
		}
		else if (GameData.windows.Bet13Lines.isSelected()== true && Integer.parseInt(GameData.windows.inputOdd.getText()) >= 100)
		{
			return 13;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean checkBetAmount(int bet, double amount)
	{
		if (bet > amount)
		{
			return false;
		}
		return true;
	}
	
	public static boolean accountBalanceSuffient (double amount)
	{
		if (10 > amount)
		{
			return false;
		}
		return true;
	}
}
