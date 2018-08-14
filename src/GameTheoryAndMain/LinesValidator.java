package GameTheoryAndMain;
import java.util.ArrayList;

import GameData.*;

public class LinesValidator {
	/*
	 * 0  1  2  3  4 
	 * 5  6  7  8  9
	 * 10 11 12 13 14
	 */
	
	public static boolean oneLine(ArrayList<Results> R, int bet)
	{
		GameData.payout = new OddsCal();
		double currentPayout = 0;
		double linePayout = 0;
		boolean flag = false;
		//Line 1 : 5,6,7,8,9
		linePayout = lineCal (R,bet,5,6,7,8,9);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 1");
			flag = true;
			
		}
		return flag;
	}
	
	public static boolean oneToThreeline(ArrayList<Results> R, int bet)
	{
		GameData.payout = new OddsCal();
		double currentPayout = 0;
		double linePayout = 0;
		boolean flag = false;
		//Line 2 : 0,1,2,3,4
		linePayout = lineCal (R,bet,0,1,2,3,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 2");
			flag = true;
			
		}
		//Line 1 : 5,6,7,8,9
		linePayout = lineCal (R,bet,5,6,7,8,9);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 1");
			flag = true;
			
		}
		//Line 3 : 10,11,12,13,14
		linePayout = lineCal (R,bet,10,11,12,13,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 3");
			flag = true;
			
		}
		return flag;
	}
	
	public static boolean oneToFiveline(ArrayList<Results> R, int bet)
	{
		GameData.payout = new OddsCal();
		double currentPayout = 0;
		double linePayout = 0;
		boolean flag = false;
		//Line 2 : 0,1,2,3,4
		linePayout = lineCal (R,bet,0,1,2,3,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 2");
			flag = true;
			
		}
		//Line 1 : 5,6,7,8,9
		linePayout = lineCal (R,bet,5,6,7,8,9);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 1");
			flag = true;
			
		}
		//Line 3 : 10,11,12,13,14
		linePayout = lineCal (R,bet,10,11,12,13,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 3");
			flag = true;
			
		}
		//Line 4 : 10,6,2,8,4
		linePayout = lineCal (R,bet,10,6,2,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 4");
			flag = true;
			
		}
		//Line 5 : 0,6,12,8,4
		linePayout = lineCal (R,bet,0,6,12,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 5");
			flag = true;
			
		}
		return flag;
	}

	public static boolean oneTo13line(ArrayList<Results> R, int bet)
	{
		GameData.payout = new OddsCal();
		double currentPayout = 0;
		double linePayout = 0;
		boolean flag = false;
		//Line 2 : 0,1,2,3,4
		linePayout = lineCal (R,bet,0,1,2,3,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 2");
			flag = true;
			
		}
		//Line 1 : 5,6,7,8,9
		linePayout = lineCal (R,bet,5,6,7,8,9);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 1");
			flag = true;
			
		}
		//Line 3 : 10,11,12,13,14
		linePayout = lineCal (R,bet,10,11,12,13,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 3");
			flag = true;
			
		}
		//Line 4 : 10,6,2,8,4
		linePayout = lineCal (R,bet,10,6,2,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 4");
			flag = true;
			
		}
		//Line 5 : 0,6,12,8,4
		linePayout = lineCal (R,bet,0,6,12,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 5");
			flag = true;
			
		}
		//Line 6 : 0,1,7,13,14
		linePayout = lineCal (R,bet,0,1,7,13,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 6");
			flag = true;
			
		}
		//Line 7 : 10,11,7,3,4
		linePayout = lineCal (R,bet,10,11,7,3,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 7");
			flag = true;
			
		}
		//Line 8 : 5,1,7,13,14
		linePayout = lineCal (R,bet,5,1,7,13,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 8");
			flag = true;
			
		}
		//Line 9 : 5,11,7,3,9
		linePayout = lineCal (R,bet,5,11,7,3,9);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 9");
			flag = true;
			
		}
		//Line 10 : 1,6,7,8,14
		linePayout = lineCal (R,bet,0,6,7,8,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 10");
			flag = true;
			
		}
		//Line 11 : 10,6,7,8,4
		linePayout = lineCal (R,bet,10,6,7,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 11");
			flag = true;
			
		}
		//Line 12 : 5,1,2,8,14
		linePayout = lineCal (R,bet,5,1,2,8,14);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 12");
			flag = true;
			
		}
		//Line 13 : 5,11,12,8,14
		linePayout = lineCal (R,bet,5,11,12,8,4);
		if (linePayout > currentPayout){
			currentPayout = linePayout;
			GameData.payout.setPayout(currentPayout);
			GameData.payout.setLine("Line 13");
			flag = true;
			
		}
		return flag;
	}
	
	
	public static double lineCal (ArrayList<Results> R, int bet, int e0, int e1, int e2, int e3 , int e4)
	{
		int count = 0;
		double payout = 0;
		Results validateLine[] = new Results [5];
		validateLine[0] = R.get(e0);
		validateLine[1] = R.get(e1);
		validateLine[2] = R.get(e2);
		validateLine[3] = R.get(e3);
		validateLine[4] = R.get(e4);
		for (int i=0; i<5 ;i++){
			for (int j=0 ; j<5 ; j++){
				if(validateLine[i].getResultsToFruits()==validateLine[j].getResultsToFruits())
				{
					count++;
				}
			}
			if (count >= 3){
				OddsCal lineCal_temp = new OddsCal();
				lineCal_temp.setOdds(validateLine[i].getFruits().getOdd());
				payout = lineCal_temp.calPayout(count, bet);
				break;
			}
			else{
				count = 0;
			}
		}
		return payout;
	}
}
